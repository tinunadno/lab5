package lab5.Commands;

import lab5.MainClasses.LabWorkListManager;

public class Add implements Command {
	@Override
	public void execute(){
		LabWorkListManager.append(LabWorkParser.parseLabWorkFromConsole());
	}
	@Override
	public String getComment(){
		return "add%добавить новый элемент в коллекцию";
	}
}