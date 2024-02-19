package lab5.Commands;

import lab5.MainClasses.LabWorkListManager;

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