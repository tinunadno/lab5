package lab5.Commands;

import lab5.MainClasses.LabWorkListManager;

public class Info implements Command {
	@Override
	public void execute(){
		System.out.println(LabWorkListManager.getCollectionInfo());
	}
	@Override
	public String getComment(){
		return "info%вывести в стандартный поток вывода информацию о коллекции";
	}
}