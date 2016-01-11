package praktikum3;

/**
 * Created by Kerdo Kullamäe on 11.01.2016.
 */
public class Inverse2 {

    public static void main (String[] args) {
        System.out.println (inverse (1234)); // 4321
    }

    public static int inverse (int n) {
        String numbrid = Integer.toString(n);
        String reverse = "";
        int index = 0;
        for (int i=0; i<numbrid.length();i++) {
             index = (numbrid.length()-i)-1;
             reverse = reverse + numbrid.charAt(index);
    }
    return Integer.parseInt(reverse);
}
}
