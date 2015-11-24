package praktikum12;

/**
 * Created by Kerdo Kullamäe on 16.11.2015.
 */
public class RidadeMaksimum {
    public static void main(String[] args) {
        int[][] neo = {
                {1, 1, 1, 1, 1},
                {2, 3, 4, 5, 6},
                {3, 4, 5, 6, 7},
                {4, 5, 6, 7, 8},
                {5, 6, 7, 8, 9},
        };

        Massiiv.tryki(ridadeMaksimumid(neo));
    }

    public static int[] ridadeMaksimumid(int[][] maatriks) {
        int[] maxElements = new int[maatriks.length];

        for (int i=0;i<maatriks.length;i++) {
            int max = Integer.MIN_VALUE;

            for (int el : maatriks[i]) {
                if (el>max) {
                    max = el;
                }
            }
            maxElements[i] = max;
        }
        return maxElements;
    }
}
