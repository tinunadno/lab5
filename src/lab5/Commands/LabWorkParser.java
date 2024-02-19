package lab5.Commands;
import java.util.Scanner;
import lab5.StoredClasses.*;
import lab5.StoredClasses.*;

public class LabWorkParser {
    private static Scanner in;
    private static boolean isFromFile=false;
    public static void setScanner(Scanner scan){
        in=scan;
        isFromFile=true;
    }

    public static LabWork parseLabWorkFromConsole(){
        try{
            if(in==null || in.hasNext()==false)in=new Scanner(System.in);

            System.out.println("insert LabWork class fields");
            System.out.print("name<String>:");
            String name=in.nextLine();

            System.out.println(name);

            System.out.println("Coordinates:");
            float x=tryParseFloat("\tx<float>:");
            System.out.print("\ty<int>:");
            int y=tryParseInt("\ty<int>:");
            Coordinates coordinates=new Coordinates(x, y);

            float minimalPoint=tryParseFloat("minimalPoint<float>:");

            System.out.print("description<String>:");
            String description=(in.nextLine());

            int tunedInWorks=tryParseInt("tunedInWorks<int>:");

            System.out.print("Difficulty(Only {VERY_HARD; INSANE; TERRIBLE} allowed):");
            Difficulty difficulty=Difficulty.parse(in.nextLine());

            System.out.println("Person:");
            System.out.print("\tname<String>:");
            String personName=(in.nextLine());
            System.out.print("\tpassportId<String>:");
            String passportId=(in.nextLine());
            System.out.print("\teyeColor(Only {RED; BLUE; ORANGE; WHITE} allowed):");
            Color eyeColor=Color.parse(in.nextLine());
            System.out.println("\t\tLocation:");
            float locationX=tryParseFloat("\t\tx<float>:");
            float locationY=tryParseFloat("\t\ty<float>:");
            System.out.print("\t\tname<String>:");
            String locationName=(in.nextLine());
            Location location=new Location(locationX, locationY, locationName);
            Person person = new Person(personName, passportId, eyeColor, location);

            LabWork labwork=new LabWork(name, coordinates, minimalPoint, description, tunedInWorks, difficulty, person);
            System.out.println();
            isFromFile=false;
            return labwork;
        }catch(NumberFormatException e){System.out.println("oops, you made a mistake, try again"); }
        return null;
    }

    private static float tryParseFloat(String msg){
        boolean flag=false;
        float ret=0.0f;
        while(!flag){
            System.out.print(msg);
            try {
                ret=Float.parseFloat(in.nextLine());
                flag=true;
            }catch(NumberFormatException e){
                System.out.println("bad Number format");
                if(isFromFile)
                    flag=true;
            }
        }
        return ret;
    }

    private static int tryParseInt(String msg){
        boolean flag=false;
        int ret=0;
        while(!flag){
            System.out.print(msg);
            try {
                ret=Integer.parseInt(in.nextLine());
                flag=true;
            }catch(NumberFormatException e){
                System.out.println("bad Number format");
                if(isFromFile)
                    flag=true;
            }
        }
        return ret;
    }
}
