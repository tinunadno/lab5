package lab5.Commands;

import lab5.MainClasses.LabWorkListManager;

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