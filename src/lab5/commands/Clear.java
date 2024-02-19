package lab5.commands;

import lab5.mainClasses.LabWorkListManager;

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