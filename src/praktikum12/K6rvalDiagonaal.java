package praktikum12;

/**
 * Created by Kerdo Kullamäe on 13.11.2015.
 */
public class K6rvalDiagonaal {
    public static void main(String[] args) {
        int[][] neo = {
                {2, 3, 4, 5, 6},
                {3, 4, 5, 6, 7},
                {4, 5, 6, 7, 8},
                {5, 6, 7, 8, 9},
                {1, 1, 1, 1, 1},
        };
        System.out.print(korvalDiagonaal(neo));
    }


    public static int korvalDiagonaal(int[][] maatriks) {
        int sum = 0;
        for (int i=0; i<maatriks.length;i++) {
            sum += maatriks[i][i];
        }
        return sum;
    }
}
