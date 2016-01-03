package praktikum12USEFUL;

/**
 * Created by Kerdo Kullamäe on 16.11.2015.
 */
public class Transporteerimine{
        public static void main(String[] args) {
            int[][] neo = {
                    {1, 1, 1, 1, 1},
                    {2, 3, 4, 5, 6},
                    {3, 4, 5, 6, 7},
                    {4, 5, 6, 7, 8},
                    {5, 6, 7, 8, 9},
            };

            Maatriks.tryki(transporteeri(neo));
        }

    public static int[][] transporteeri(int[][] maatriks) {
        int[][] maatriks2 = new int[maatriks.length][maatriks[0].length];
        for (int row = 0; row < maatriks.length; row++) {
            for (int col = 0; col < maatriks[row].length; col++) {
                maatriks2[col][row] = maatriks[row][col];
            }
        }
        return maatriks2;
    }
}
