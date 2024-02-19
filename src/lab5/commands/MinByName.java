package lab5.commands;

import lab5.mainClasses.LabWorkListManager;

public class MinByName implements Command {
	@Override
	public void execute(){
		LabWorkListManager.printMinByName();
	}
	@Override
	public String getComment(){
		return "min_by_name%вывести любой объект из коллекции, значение поля name которого является минимальным";
	}
}