package praktikum12;

/**
 * Created by Kerdo Kullamäe on 16.11.2015.
 */
public class PraksK6ikKoos {
    public static void main(String[] args){
        int [][] neo = {
                {1, 1, 1, 1, 1},
                {2, 3, 4, 5, 6},
                {3, 4, 5, 6, 7},
                {4, 5, 6, 7, 8},
                {5, 6, 7, 8, 9},
        };
        // ülesanne 1. prindib maatriksi "neo" teise rea
        tryki(neo[1]);
        // ülesanne 2.
        System.out.println("\n");
        tryki(neo);
        // ülesanne 3. kasutan printimiseks esimese ülesande meetodit
        tryki(ridadeSummad(neo));
        // ülesanne 4:
        System.out.print(korvalDiagonaaliSumma(neo));
        // ülesanne 5. kasutan printimiseks esimese ülesande meetodit
        tryki(ridadeMaksimumid(neo));
        // ülesanne 6
        System.out.println(miinimum(neo));
        // ülesanne 7. kasutan printimiseks teise ülesande meetodit
        tryki(kahegaJaakMaatriks(4,4));
        // ülesanne 8. kasutan printimiseks teise ülesande meetodit
        tryki(transponeeri(neo));

    }

    /**
     * Kirjutada meetod, mis trükib ekraanile ühel real parameetrina etteantud ühemõõtmelise täisarvumassiivi elemendid
     * @param massiiv
     */
    public static void tryki(int[] massiiv){
        System.out.println("Ylesanne 1:");
        for(int element : massiiv){
            System.out.print(element + " ");
        }
    }

    /**
     * Kirjutada meetod, mis trükib ekraanile parameetrina etteantud kahemõõtmelise massiivi (maatriksi)
     * @param maatriks
     */
    public static void tryki(int[][] maatriks){
        System.out.println("Ülesanne 2:");
        for(int[] row : maatriks){
            for(int el : row){
                System.out.print(el + " ");
            }
            System.out.println();
        }
    }

    /**
     * Arvutada maatriksi iga rea elementide summa
     * @param maatriks
     * @return
     */
    public static int[] ridadeSummad(int[][] maatriks){
        System.out.println("\nÜlesanne 3:");
        //loon massiivi
        int[] sums = new int[maatriks.length];
        //iga rea kohta tee seda;
        for(int i = 0; i < maatriks.length; i++){
            //iga i rea elemendi kohta tee seda:
            for (int el : maatriks[i]){
                //liida juurde summade massiivi i elemendile
                sums[i] += el;
            }
        }
        return sums;
    }

    /**
     * Arvutada kõrvaldiagonaali elementide summa
     * (kõrvaldiagonaal on see, mis jookseb ülevalt paremast nurgast alla vasakusse nurka).
     * @param maatriks
     * @return
     */
    public static int korvalDiagonaaliSumma(int[][] maatriks){
        System.out.println("\n\nÜlesanne 4:");

        int sum = 0;

        for (int i = 0; i < maatriks.length; i++){
            sum += maatriks[i][maatriks[i].length - i - 1];
        }

        return sum;
    }

    /**
     * Leida iga rea suurim element
     * @param maatriks
     * @return
     */
    public static int[] ridadeMaksimumid(int[][] maatriks){
        System.out.println("\n\nÜlesanne 5:");
        int[] maxElements = new int[maatriks.length];

        for (int i = 0; i < maatriks.length; i++){
            int max = Integer.MIN_VALUE;
            //leian maksimum elemendi i-s reas
            for (int el : maatriks[i]){
                if(el > max){
                    max = el;
                }
            }
            //lisan max elemendi tagastatava massiivi i-ndale kohgale
            maxElements[i] = max;
        }
        return maxElements;
    }

    /**
     * Leida kogu maatriksi väikseim element.
     * @param maatriks
     * @return
     */
    public static int miinimum(int[][] maatriks){
        System.out.println("\n\nÜlesanne 6:");
        int min = Integer.MAX_VALUE;
        for (int[] row : maatriks){
            for (int col : row){
                if(col < min){
                    min = col;
                }
            }
        }
        return min;
    }

    /**
     * Kirjutada programm, mis genereerib parameetritena etteantud suurusega maatriksi,
     * kus iga element on rea ja veeruindeksi summa kahega jagamise jääk. Indeksid algavad nullist.
     * @param ridu
     * @param veerge
     * @return
     */
    public static int[][] kahegaJaakMaatriks(int ridu, int veerge){
        System.out.println("\nÜlesanne 7:");
        int[][] maatriks = new int[ridu][veerge];
        for (int i = 0; i < ridu; i++){
            for (int j = 0; j < veerge; j++){
                maatriks[i][j] = (i + j) % 2;
            }
        }
        return maatriks;
    }

    /**
     * Transponeerida allpool toodud maatriks ja trükkida tulemus ekraanile.
     * @param maatriks
     * @return
     */
    public static int[][] transponeeri(int[][] maatriks){
        System.out.println("\nÜlesanne 8:");
        int[][] maatriks2 = new int[maatriks.length][maatriks[0].length];

        for (int row = 0; row < maatriks.length; row++){
            for (int col = 0; col < maatriks[row].length; col++){
                maatriks2[col][row] = maatriks[row][col];
            }
        }
        return maatriks2;
    }

}

