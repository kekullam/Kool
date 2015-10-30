package praktikum8;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by margus@workstation on 23.10.2015.
 */
public class S6naTrykk {

    public static Scanner userInput = new Scanner(System.in);

    public static void main(String[] args){
        String s6na = "";
        System.out.print("Sisesta s6na: ");
        s6na = getName();

        //creating string array of letters:
        String[] s6naArray = s6na.split("");

        //printing:
        for (int i = 0; i < s6naArray.length; i++){
            System.out.print(s6naArray[i].toUpperCase());
            //if not last letter, print "-" aswell
            if (i + 1 != s6naArray.length){
                System.out.print("-");
            }
        }
        userInput.close();
    }

    private static String getName(){
        String name = "";
        try {
            name = userInput.next();
        }catch (InputMismatchException e){}
        return name;
    }
}