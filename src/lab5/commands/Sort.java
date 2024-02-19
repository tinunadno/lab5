package lab5.commands;

import lab5.mainClasses.LabWorkListManager;

public class Sort implements Command {
	@Override
	public void execute(){
		LabWorkListManager.sort();
	}
	@Override
	public String getComment(){
		return "sort%отсортировать коллекцию в естественном порядке";
	}
}