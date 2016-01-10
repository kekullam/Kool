package praktikum3;

/**
 * Created by Kerdo Kullam�e on 2.01.2016.
 */

// Koostage Java-meetod, mis genereerib parameetrina etteantud n j�rgi n korda n t�isarvumaatriksi, mille
// peadiagonaalil on �hed ning k�ik �lej��nud elemendid nullid.

public class MaatriksDiagonaalYhed {

    public static void main(String[] args) {

        int[][] maatriks = yhik(10);

        for(int[] row:maatriks) {
            for (int col:row) {
                System.out.printf("%4d", col);
            }
            System.out.println();
        }
    }

    public static int[][] yhik(int n) {
        int[][] maatriks = new int[n][n];

        for (int i=0;i<n;i++) {
            for (int j=0;j<n;j++) {
                if (i==j) {
                    maatriks[i][j] = 1;
                } else {
                    maatriks[i][j] = 0;
                }
            }
        }
        return maatriks;
    }
}
