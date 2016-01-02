package kt1;

/**
 * Created by Kerdo Kullamäe on 2.01.2016.
 */

// Koostage Java-meetod, mis leiab etteantud massiivi m rangelt positiivsete elementide arvu

public class PositiivseteElementideArv {

    public static void main(String[] args) {
        int[] m = {1, 2 ,3 ,4, 5, -6, -7};
        System.out.println(posElArv(m));
    }

    public static int posElArv(int[] m) {
        int count =0;
        for(int e : m) {
            if (e>0) {
                count++;
            }
        }
        return count;
    }
}
