package praktikum3;

/**
 * Created by Kerdo Kullamäe on 3.01.2016.
 */

// Koostage Java-meetod, mis genereerib parameetrina etteantud n järgi sellise n korda n täisarvumaatriksi
// mille iga elemendi väärtuseks on minimaalne selle elemendi reaindeksist ja veeruideksist(indeksid algavad nullist)

public class MusterMinElemendiIndeks {

    public static void main(String[] args) {

        int[][] maatirks = muster(6);

        for (int[] row:maatirks) {
            for (int col : row) {
                System.out.printf("%4d", col);
            }
            System.out.println();
        }

    }

    public static int[][] muster(int n) {

        int[][] res = new int[n][n];

        for (int i=0;i<res.length;i++) {
            for (int j = 0;j<res.length;j++) {
                if (i<j) {
                    res[i][j] = i;
                } else {
                    res[i][j] = j;
                }
            }
        }
        return res;
    }
}
