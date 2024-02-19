package lab5.Commands;

import lab5.MainClasses.LabWorkListManager;
import lab5.StoredClasses.LabWork;

public class Update implements CommandWithArgument {
	private String argument;
	@Override
	public void execute(){
		try {
			int index = Integer.parseInt(argument);
			LabWork labwork=LabWorkParser.parseLabWorkFromConsole();
			LabWorkListManager.set(index, labwork);
		}catch(NumberFormatException e){
			System.out.println("can't interpretate "+argument+" as integer");
		}
	}
	@Override
	public String getComment(){
		return "update id%обновить значение элемента коллекции, id которого равен заданному";
	}
	@Override
	public void setArgument(String arg){this.argument=arg;}
}