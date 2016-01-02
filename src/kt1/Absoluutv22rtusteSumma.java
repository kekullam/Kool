package kt1;

/**
 * Created by Kerdo Kullam‰e on 2.01.2016.
 */

// Koostage Java-meetod, mis leiab kahe etteantud reaalarvu absoluutv‰‰rtuste summa

public class Absoluutv22rtusteSumma {

    public static void main(String[] args) {
        System.out.println(absvdeSumma(-0.5,-1.5));
    }

    public static double absvdeSumma(double a,double b) {
        return Math.abs(a) + Math.abs(b);
    }

}
