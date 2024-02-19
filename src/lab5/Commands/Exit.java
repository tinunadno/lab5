package lab5.Commands;
public class Exit implements Command {
	@Override
	public void execute(){
		System.exit(0);
	}
	@Override
	public String getComment(){
		return "exit%завершить программу (без сохранения в файл)";
	}
}