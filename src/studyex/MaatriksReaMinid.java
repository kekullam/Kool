package studyex;

/**
 * Created by Kerdo Kullam‰e on 6.01.2016.
 */

// Koostage Java meetod etteantud t‰isarvumaatriksi m reamiinimumide massiivi leidmiseks
// (massiivi i-s element on maatriksi i-nda rea v‰hima elemendi v‰‰rtus). Read vıivad olla erineva pikkusega.

public class MaatriksReaMinid {

    public static void main(String[] args) {

        int[] res = reaMinid (new int[][] { {1,2,3,0},
                                            {4,5,6},
                                            {1,0,10}});

        for (int i=0;i<res.length;i++) {
            System.out.println(res[i]);
        }
    }

    public static int[] reaMinid(int[][] m) {
       int[] min = new int[m.length];

        for (int i = 0; i<m.length;i++) {
            min[i] = m[i][0];
            for (int j = 0;j<m[i].length;j++) {
                if (min[i] > m[i][j]) {
                    min[i] = m[i][j];
                }
            }
        }
        return min;
    }
}
