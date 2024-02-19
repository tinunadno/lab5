package lab5.commands;
public interface CommandWithArgument {
    public void execute();
    public String getComment();
    public void setArgument(String arg);
}
