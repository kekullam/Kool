package praktikum8;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by margus@workstation on 23.10.2015.
 */
public class Palindroom {

    public static Scanner userInput = new Scanner(System.in);

    public static void main(String[] args){
        String word = "";
        //saan kasutajalt s6na
        System.out.print("Sisesta s6na: ");
        word = getName();

        //teen s6nast t2htede massiivi
        char[] wordArray = word.toCharArray();

        //kontrollin s6na
        if (checkForPalindrome(wordArray)){
            System.out.println("Jah, see on palindroom");
        }else{
            System.out.println("Nope, see pole palindroom");
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

    /**
     * TAIBUDEMEETODIGA
     * @param array t2htedemassiiv
     * @return boolean true/false
     */
    private static boolean checkForPalindrome(char[] array){
        // loendur s6na algusest
        int firstCounter = 0;
        //loendur s6na l6pust
        int lastCounter = array.length - 1;
        //t2htede kontroll
        while ( lastCounter > firstCounter){
            //kui t2hed pole v6rdsed, pole s6na palindroom
            //ega pole m6tet edasi testida
            if (array[firstCounter] != array[lastCounter]){
                return false;
            }
            //muudan loendurite v22rtusi
            firstCounter++;
            lastCounter--;
        }
        return true;
    }

}