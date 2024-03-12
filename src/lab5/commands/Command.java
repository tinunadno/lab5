package lab5.commands;

public abstract class Command implements CommandNoArgument{
    private boolean ifArgumentExists;
    public void setArgumentExists(boolean argExists){this.ifArgumentExists=argExists;}
    public abstract void execute();
    public abstract String getComment();
    public boolean argumentExists(){return ifArgumentExists;}
}
