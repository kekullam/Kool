package kt2;

/**
 * Created by Kerdo Kullam‰e on 2.01.2016.
 */

// Koostage Java-meetod etteantud t‰isarvumaatriksi m veerumiinimumide massiivi leidmiseks
// (massiivi j-ndaks elemendiks on maatriksi j-nda veeru v‰hima elemendi v‰‰rtus).
// Arvestage, et m read vıivad olla erineva pikkusega.

public class MaatriksiVeeruMinid {

    public static void main(String[] args) {

        int[][] maatriks =  {
                {1,2,6},
                {4,5,3,4,5},
                {4,5,0,2},
                {2,6,8,10,3,6,20}};

        int[] res = veeruMinid(maatriks);

        for (int i = 0;i<res.length;i++) {
            System.out.print(res[i] + " ");
        }
    }

    public static int[] veeruMinid(int[][] m) {
        int res = 0;

        //Leiame kıige pikema rea pikkuse
        for (int rida=0;rida<m.length;rida++) {
            if (res < m[rida].length)
                res = m[rida].length;
        }

        int[] massiiv = new int[res];

        // Anname alguses kıige suuremad v‰‰rtused massiivile
        for (int i =0;i<massiiv.length;i++) {
            massiiv[i] = Integer.MAX_VALUE;
        }

        // Leiame v‰iksemad lahendid
        for (int i=0;i < m.length;i++) {
            for (int j=0;j< m[i].length;j++) {
                if(massiiv[j] > m[i][j]) {
                    massiiv[j] = m[i][j];
                }
            }
        }
        return massiiv;
    }

}
