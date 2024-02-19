package lab5.Commands;

import lab5.MainClasses.LabWorkListManager;

public class Show implements Command {
	@Override
	public void execute(){
		System.out.println(LabWorkListManager.getCollectionAsString());
	}
	@Override
	public String getComment(){
		return "show%вывести в стандартный поток вывода все элементы коллекции в строковом представлении";
	}
}