package praktikum3;

/**
 * Created by Kerdo Kullam‰e on 2.01.2016.
 */

// Koostage Java-meetod, mis genereerib parameetrina etteantud n j‰rgi niisuguse n korda n t‰isarvumaatriksi
// mille iga elemendi v‰‰rtuseks on selle elemendi reaindeksi ja veeruindeksi summa ruut(indeksid algavad nullist)

public class MaatriksMuster {

    public static void main(String[] args) {
        int[][] maatriks = muster(10);

        //printimine
        for(int[] row : maatriks) {
            for (int col : row) {
                System.out.printf("%4d", col);
            }
            System.out.println();
        }
    }

    public static int[][] muster(int n) {
        int[][] maatriks = new int[n][n];

        for(int i=0;i<n;i++) {
            for (int j=0;j<n;j++) {
                maatriks[i][j] = (int) Math.pow(i+j,2);
            }
        }
        return maatriks;
    }
}
