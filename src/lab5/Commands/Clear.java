package lab5.Commands;

import lab5.MainClasses.LabWorkListManager;

public class Clear implements Command {
	@Override
	public void execute(){
		LabWorkListManager.clear();
	}
	@Override
	public String getComment(){
		return "clear%очистить коллекцию";
	}
}