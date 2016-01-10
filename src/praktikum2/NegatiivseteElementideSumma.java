package praktikum2;

/**
 * Created by Kerdo Kullamäe on 2.01.2016.
 */

// Koostage Java-meetod, mis leiab etteantud massiivi m negatiivsete elementide summa

public class NegatiivseteElementideSumma {

    public static void main(String[] args) {
        int[] m = {-1,-1,-1, 2, 2, 2, 3, -5};
        System.out.println(negSumma(m));
    }

    public static int negSumma(int[] m) {
        int sum = 0;
        for (int el:m) {
            if(el<0) {
                sum +=el;
            }
        }
        return sum;
    }

}
