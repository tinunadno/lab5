package lab5.Commands;

import lab5.MainClasses.LabWorkListManager;

public class RemoveByID implements CommandWithArgument {
	private String argument;
	@Override
	public void execute(){
		int index=Integer.parseInt(argument);
		LabWorkListManager.remove(index);
	}
	@Override
	public String getComment(){
		return "remove_by_id id%удалить элемент из коллекции по его id";
	}
	@Override
	public void setArgument(String arg){this.argument=arg;}
}