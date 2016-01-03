package praktikum12USEFUL;

/**
 * Created by Kerdo Kullamäe on 13.11.2015.
 */
public class ReaSuurimElement {

    public static void main(String[] args) {
        int[][] neo = {
                {2, 3, 4, 5, 6},
                {3, 4, 5, 6, 7},
                {4, 5, 6, 7, 8},
                {5, 6, 7, 8, 9},
                {1, 1, 1, 1, 1},
        };
        Massiiv.tryki(ridadeSumma(neo));

    }
    public static int[] ridadeSumma(int[][] maatriks) {
        int[] sums = new int[maatriks.length];
        for (int i=0; i<maatriks.length;i++) {
            for (int el : maatriks[i]) {
                sums[i] += el;
            }
        }
        return sums;
    }
}

