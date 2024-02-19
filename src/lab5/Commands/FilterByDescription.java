package lab5.Commands;

import lab5.MainClasses.LabWorkListManager;

public class FilterByDescription implements CommandWithArgument{
	private String argument;
	@Override
	public void execute(){
		LabWorkListManager.FilterByDescription(argument);
	}
	@Override
	public String getComment(){
		return "filter_by_description description%вывести элементы, значение поля description которых равно заданному";
	}
	@Override
	public void setArgument(String arg){this.argument=arg;}
}