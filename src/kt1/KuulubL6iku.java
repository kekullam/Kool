package kt1;

/**
 * Created by Kerdo Kullamäe on 2.01.2016.
 */

//Koostage Java-meetod, mis teeb kindlaks, kas etteantud täisarv n kuulub lõiku 10 kuni 99(otspunktid kaasaarvatud)

public class KuulubL6iku {

    public static void main(String[] args) {
        System.out.println(pos2k(55));
    }

    public static boolean pos2k(int n) {
        if (n>=10 && n<=99) {
            return true;
        } else {
            return false;
        }
    }
}
