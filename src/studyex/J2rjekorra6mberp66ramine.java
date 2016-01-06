package studyex;

/**
 * Created by Kerdo Kullamäe on 6.01.2016.
 */

// On antud positiivne täisarv n. Kirjutada Java meetod, mis leiab täisarvu,
// mis saadakse n kümnendesituses numbrite järjekorra ümberpööramise teel.

public class J2rjekorra6mberp66ramine {

    public static void main(String[] args) {

        System.out.println(inverse(123456));

    }

    public static int inverse (int n) {
        int backwards = 0;
        int rest = 0;

        do {
            rest = n%10;
            backwards = backwards*10 + rest;
            n = n/10;
        } while (n>0);
        return backwards;
        }
    }

