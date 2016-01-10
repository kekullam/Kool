package praktikum2;

/**
 * Created by Kerdo Kullamäe on 2.01.2016.
 */
public class PosPaarisArv {

    public static void main(String[] args) {
        System.out.println(posPaarisarv(3));
    }
    public static boolean posPaarisarv(int n) {
        if (n > 0 && n % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }
}
