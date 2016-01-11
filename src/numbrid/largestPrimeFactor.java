package numbrid;

import java.util.Random;

/**
 * Created by Kerdo Kullamäe on 10.01.2016.
 */
public class largestPrimeFactor {

    public static void main(String[] args) {

        System.out.println(largestPrimeFactor(1234));
    }
    public static int largestPrimeFactor(int number) {
        int i;

        for (i = 2; i <= number; i++) {
            if (number % i == 0) {
                number /= i;
                i--;
            }
        }
        return i;
    }
}


