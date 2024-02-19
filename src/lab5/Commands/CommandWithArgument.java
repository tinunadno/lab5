package lab5.Commands;
public interface CommandWithArgument {
    public void execute();
    public String getComment();
    public void setArgument(String arg);
}
