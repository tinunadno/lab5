package lab5.commands;

import lab5.mainClasses.Controller;

public class Help extends Command {
	@Override
	public void execute(){
		Controller.showComands();
	}
	@Override
	public String getComment(){
		return "help%вывести справку по доступным командам";
	}
}