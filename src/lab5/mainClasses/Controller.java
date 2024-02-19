package lab5.mainClasses;

import lab5.commands.*;

import java.util.Map;
import java.util.HashMap;
public class Controller {
	private static Map<String, Command> comands=new HashMap<String, Command>();
	private static Map<String, CommandWithArgument> comandsWithArgument=new HashMap<String, CommandWithArgument>();
	static{
		comands.put("help", new Help());
		comands.put("info", new Info());
		comands.put("show", new Show());
		comands.put("add", new Add());
		comandsWithArgument.put("update", new Update());
		comandsWithArgument.put("remove_by_id", new RemoveByID());
		comands.put("clear", new Clear());
		comands.put("exit", new Exit());
		comands.put("add_if_max", new AddIfMax());
		comandsWithArgument.put("remove_greater", new RemoveGreater());
		comandsWithArgument.put("filter_by_description", new FilterByDescription());
		comands.put("print_field_ascending_difficulty", new PrintFieldAscendingDifficulty());
		comands.put("min_by_name", new MinByName());
		comands.put("sort", new Sort());
		comandsWithArgument.put("save", new Save());
		comandsWithArgument.put("execute_script", new ExecuteScript());
	}
	
	public static void invoke(String key){
		try{
		comands.get(key).execute();
		}catch(NullPointerException e){System.out.println("\""+key+"\" is not a command, use help for syntax");}
	}
	public static void invoke(String key, String argument){
		try{
			comandsWithArgument.get(key).setArgument(argument);
			comandsWithArgument.get(key).execute();
		}catch(NullPointerException e){
			System.out.println("\""+key+"\" is not a command, use help for syntax");
		}
	}
	
	
	public static void showComands(){
		System.out.println("commands without arguments:");
		for (Command value : comands.values()) {
			System.out.println(value.getComment().replace("%", "   "));
		}
		System.out.println("commands with arguments:");
		for (CommandWithArgument value : comandsWithArgument.values()) {
			System.out.println(value.getComment().replace("%", "   "));
		}
	}
}