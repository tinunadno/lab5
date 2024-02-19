package lab5.Commands;

import lab5.MainClasses.LabWorkListManager;

public class Save implements CommandWithArgument {
	private String argument;
	@Override
	public void execute(){
		LabWorkListManager.save(argument.replace("\"", ""));
	}
	@Override
	public String getComment(){
		return "save%сохранить коллекцию в файл";
	}
	public void setArgument(String arg){this.argument=arg;}
}