package praktikum12USEFUL;

/**
 * Created by Kerdo Kullamäe on 14.11.2015.
 */
public class MinElement {
    public static void main(String[] args) {
        int[][] neo = {
                {2, 3, 4, 5, 6},
                {3, 4, 5, 6, 7},
                {4, 5, 6, 7, 8},
                {5, 6, 7, 8, 9},
                {1, 1, 1, 1, 1},
        };
        System.out.print("Maatriksi minimaalne element on: " + minValue(neo));

    }

    public static int minValue(int[][] maatriks) {
        int min = Integer.MAX_VALUE;
        for (int[] row : maatriks) {
            for (int col : row) {
                if (col < min) {
                    min = col;
                }
            }
        }
        return min;
    }
}
