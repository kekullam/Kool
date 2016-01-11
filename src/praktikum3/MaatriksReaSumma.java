package praktikum3;

/**
 * Created by Kerdo Kullamäe on 11.01.2016.
 */
public class MaatriksReaSumma {

    public static void main(String[] args) {


        int[][] maatriks = {
                {1, 2, 6},
                {4, 5, 3, 4, 5},
                {4, 5, 0, 2},
                {2, 6, 8, 10, 3, 6, 20}};

        int[] res = reaSummad(maatriks);

        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i] + " ");
        }
    }

    public static int[] reaSummad(int[][] m) {

        int[] res = new int[m.length];

        for (int i=0;i<m.length;i++) {
            int reasum = 0;
            for (int j=0;j<m[i].length;j++) {
                reasum += m[i][j];
            }
            res[i] = reasum;
        }
        return res;
    }
}
