package lab5.Commands;

import lab5.MainClasses.LabWorkListManager;

public class RemoveGreater implements CommandWithArgument {
	private String argument;
	@Override
	public void execute(){
		LabWorkListManager.RemoveGreater(Float.parseFloat(argument));
	}
	@Override
	public String getComment(){
		return "remove_greater%удалить из коллекции все элементы, превышающие заданный";
	}
	@Override
	public void setArgument(String arg){this.argument=arg;}
}