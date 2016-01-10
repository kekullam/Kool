package praktikum2;

/**
 * Created by Kerdo Kullamäe on 2.01.2016.
 */

// Koostage Java-Meetod, mis leiab kahe etteantud reaalarvu summa kuubi.

public class ReaalarvuSummaKuup {

    public static void main(String[] args) {
        System.out.println(summaKuup(0.,0.));
    }


    public static double summaKuup(double a, double b) {
        return Math.pow(a, 3) + 3*(Math.pow(a,2))*b + 3*a*(Math.pow(b,2)) + Math.pow(b,3);
    }

}
