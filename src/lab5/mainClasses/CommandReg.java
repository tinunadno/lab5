package lab5.mainClasses;

public class CommandReg {
    public static void invoke(String com){
        if(charCount(com, " ")!=0){
            String commandArgument=com.substring(com.indexOf(' ')+1, com.length());
            com=com.substring(0, com.indexOf(' '));
            Controller.invoke(com, commandArgument);
        }
        else{
            Controller.invoke(com);
        }
    }
    private static int charCount(String word, String letter){
        return word.length()-(word.replace(letter, "")).length();
    }

}
