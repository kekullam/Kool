package praktikum12USEFUL;

/**
 * Created by Kerdo Kullamäe on 16.11.2015.
 */
public class KahegaJaakMaatriks {
    public static void main(String[] args) {

        Maatriks.tryki(kahegaJaakMaatriks(4,4));
    }

    public static int[][] kahegaJaakMaatriks(int ridu, int veerge) {
        int[][] maatriks = new int[ridu][veerge];
        for (int i=0;i <ridu;i++) {
            for (int j=0;j<veerge;j++) {
                maatriks[i][j] = (i+j) % 2;
            }
        }
        return maatriks;
    }
}
