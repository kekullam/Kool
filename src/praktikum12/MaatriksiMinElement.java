package praktikum12;

/**
 * Created by Kerdo Kullamäe on 16.11.2015.
 */
public class MaatriksiMinElement {
    public static void main(String[] args) {
        int[][] neo = {
                {1, 1, 1, 1, 1},
                {2, 3, 4, 5, 6},
                {3, 4, 5, 6, 7},
                {4, 5, 6, 7, 8},
                {5, 6, 7, 8, 9},
        };

        System.out.print(miinimum(neo));
    }

    public static int miinimum(int[][] maatriks) {
        int min = Integer.MAX_VALUE;

        for (int[] row : maatriks) {
            for (int col : row) {
                if (col<min) {
                    min = col;
                }
            }
        }
        return min;
    }
}
