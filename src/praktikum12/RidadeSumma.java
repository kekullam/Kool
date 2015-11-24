package praktikum12;

/**
 * Created by Kerdo Kullamäe on 13.11.2015.
 */
public class RidadeSumma {
    public static void main(String[] args) {
        int[][] neo = {
                {1, 1, 1, 1, 1},
                {2, 3, 4, 5, 6},
                {3, 4, 5, 6, 7},
                {4, 5, 6, 7, 8},
                {5, 6, 7, 8, 9},
        };

        int[] summad= ridadeSumma(neo);
        Maatriks.tryki(neo);
        System.out.println();
        for (int i : summad) {
            System.out.println(i);
        }
    }

    public static int[] ridadeSumma(int[][] maatriks){
        int[] sum = new int[maatriks.length];
        for (int i=0; i<maatriks.length;i++) {
            for (int j=0;j<maatriks[0].length;j++) {
                sum[i] += maatriks[i][j];
            }
        }
        return sum;
    }

}


