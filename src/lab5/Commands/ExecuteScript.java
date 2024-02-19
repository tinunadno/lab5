package lab5.Commands;

import lab5.StoredClasses.LabWork;
import lab5.MainClasses.LabWorkListManager;
import lab5.MainClasses.CommandReg;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
public class ExecuteScript implements Command, CommandWithArgument{
	private String argument;
	private Scanner sc;
	@Override
	public void execute(){
		try{
			File file = new File(argument.replace("\"", ""));
			sc=new Scanner(file);
		while(sc.hasNext()){
			String cmd=sc.nextLine();
			LabWork lw;
			switch(cmd){
				case "add":
					LabWorkParser.setScanner(sc);
					lw=LabWorkParser.parseLabWorkFromConsole();
					LabWorkListManager.append(lw);
					break;
				case "add_if_max":
					LabWorkParser.setScanner(sc);
					lw=LabWorkParser.parseLabWorkFromConsole();
					LabWorkListManager.addIfMax(lw);
					break;
				case "Update":
					int index=Integer.parseInt(cmd.substring(0, cmd.indexOf(' ')));
					lw=LabWorkParser.parseLabWorkFromConsole();
					LabWorkListManager.set(index, lw);
					break;
				default:
					CommandReg.invoke(cmd);
					break;
			}
			 
		}
		System.out.println();
		}catch(FileNotFoundException e){System.out.println("file not found");}
	}
	@Override
	public String getComment(){
		return "execute_script%считать и исполнить скрипт из указанного файла. В скрипте команды содержатся в том же виду, в котором вводятся в консоль";
	}
	@Override
	public void setArgument(String arg){this.argument=arg;}
}