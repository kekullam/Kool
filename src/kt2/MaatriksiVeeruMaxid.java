package kt2;

/**
 * Created by Kerdo Kullam‰e on 3.01.2016.
 */

// Koostage Java-meetod etteantud t‰isarvumaatriksi m veerumaksimumide massiivi leidmiseks
// (massiivi j-ndaks elemendiks on maatriksi j-nda veeru suurima elemendi v‰‰rtus).
// Arvestage, et m read vıivad olla erineva pikkusega.

public class MaatriksiVeeruMaxid {

    public static void main(String[] args) {

        int[][] maatriks =  {
                {1,2,6},
                {4,5,3,4,5},
                {4,5,0,2},
                {2,6,8,10,3,6,20}};

        int[] res = veeruMaxid(maatriks);

        for (int i = 0;i<res.length;i++) {
            System.out.print(res[i] + " ");
        }
    }

    public static int[] veeruMaxid(int[][] m) {
        int res = 0;

        for (int ridu =0;ridu<m.length;ridu++) {
            if ( res < m[ridu].length)
                res = m[ridu].length;
        }

        int[] massiiv = new int[res];

        // Anname alguses kıige v‰iksemad v‰‰rtused massiivile

        for (int i=0;i<massiiv.length;i++) {
            massiiv[i] = Integer.MIN_VALUE;
        }

        // Leiame suurimad lahendid

        for (int i=0;i<m.length;i++) {
            for (int j=0;j<m[i].length;j++) {
                if (massiiv[j] < m[i][j])
                    massiiv[j] = m[i][j];
            }
        }
        return massiiv;
    }
}
