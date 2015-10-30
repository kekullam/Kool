package praktikum8;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by margus@workstation on 23.10.2015.
 */
public class InimeneManager {

    public static Scanner userInput = new Scanner(System.in);

    public static void main(String[] args){
        ArrayList<Inimene> people = new ArrayList<>();
        int nameCounter = 0;

        //kysi kasutajalt mitu nime ta soovib sisestada
        System.out.print("Mitu nime soovid sisestada? : ");
        nameCounter = getAge();

        // kysi kasutajalt info inimeste kohta:
        while(people.size() < nameCounter){
            System.out.print("Sisesta nimi: ");
            String name = getName();

            System.out.print("Sisesta vanus: ");
            int age = getAge();
            //loo uus objekt "Inimene" ja lisa see massiivi "people"
            people.add(new Inimene(name, age));
        }

        // prindi inimesed:
        for(Inimene human : people){
            System.out.println(human);
        }


    }

    private static String getName(){
        String name = "";
        try {
            name = userInput.next();
        }catch (InputMismatchException e){}
        return name;
    }

    private static int getAge(){
        int age = 0;
        try {
            age = userInput.nextInt();
        }catch (InputMismatchException e){
            System.out.println("ERROR: " + e);
            userInput.next();
        }
        return age;
    }
}