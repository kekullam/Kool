package praktikum12USEFUL;

/**
 * Created by Kerdo Kullamäe on 13.11.2015.
 */
public class Maatriks {
    public static void main(String[] args) {
        int [][] neo = {
                {1, 1, 1, 1, 1},
                {2, 3, 4, 5, 6},
                {3, 4, 5, 6, 7},
                {4, 5, 6, 7, 8},
                {5, 6, 7, 8, 9},
        };
        tryki(neo);
}

    public static void tryki(int[][] maatriks) {
            for(int i= 0; i< maatriks.length; i++) {
                for (int j = 0; j < maatriks[i].length; j++) {
                    System.out.printf("%4d ", maatriks[i][j]);
                }
                System.out.println();
            }
    }
}



