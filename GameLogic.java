import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;

public class GameLogic {
    static Scanner input=new Scanner(System.in);
    static Random rand =new Random();
    static ArrayList<Character> characters=new ArrayList<Character>(3);

    public static Character chooseCharacter(String input){
        Character character=null;
        String[] characterArray = input.split(" ");
        for (int i = 0; i <characters.size() ; i++) {
            Character c = characters.get(i);
            if(c.getType()==1 && characterArray[0].equalsIgnoreCase("fighter")){
                character=c;
            }
            else if(c.getType()==2 && characterArray[0].equalsIgnoreCase("healer")){
                character=c;
            }
            else if(c.getType()==3 && characterArray[0].equalsIgnoreCase("tank")){
                character=c;
            }


        }
        return character;
    }
    public static String takeAction(String input){
        String[] splitted =input.split(" ");
        if(splitted.length!=3){
            return null ;
        }
        return splitted[1];
    }

    public static String takeTarget(String input){
        String[] splitted =input.split(" ");
        if(splitted.length!=3){
            return null ;
        }
        return splitted[2];
    }



    //item part will be here



}
