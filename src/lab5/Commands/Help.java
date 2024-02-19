package lab5.Commands;

import lab5.MainClasses.Controller;

public class Help implements Command {
	@Override
	public void execute(){
		Controller.showComands();
	}
	@Override
	public String getComment(){
		return "help%вывести справку по доступным командам";
	}
}