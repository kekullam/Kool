package praktikum2;

/**
 * Created by Kerdo Kullamäe on 2.01.2016.
 */

// Koostage Java-meetod, mis leiab kahe etteantud reaalarvu summa ruudu.

public class SummaRuut {

    public static void main(String[] args) {
        System.out.println(summaRuut(2.,2.));
    }

    public static double summaRuut(double a, double b) {
        return Math.pow(a, 2) + 2*a*b + Math.pow(b,2);
    }
}
