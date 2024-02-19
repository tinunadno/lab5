package lab5.Commands;

import lab5.MainClasses.LabWorkListManager;

public class AddIfMax implements Command {
	@Override
	public void execute(){
		LabWorkListManager.addIfMax(LabWorkParser.parseLabWorkFromConsole());
	}
	@Override
	public String getComment(){
		return "add_if_max%добавить новый элемент в коллекцию, если его значение превышает значение наибольшего элемента этой коллекции";
	}
}