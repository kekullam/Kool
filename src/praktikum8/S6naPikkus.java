package praktikum8;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by margus@workstation on 23.10.2015.
 */
public class S6naPikkus {

    public static Scanner userInput = new Scanner(System.in);

    public static void main(String[] args){
        ArrayList<String> namesList = new ArrayList<String>();

        System.out.println("Sisesta 10 nime: ");
        //get names
        while(namesList.size() < 10){
            System.out.print((namesList.size() + 1) + ": ");
            namesList.add(getName());
        }
        System.out.println("\nNimede pikkused ja nimed: ");
        for (String element : namesList){
            System.out.println(element.length() + " " + element);
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