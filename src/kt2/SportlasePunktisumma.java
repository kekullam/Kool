package kt2;

/**
 * Created by Kerdo Kullamäe on 3.01.2016.
 */

// Sportlase punktisumma arvutatakse üksikkatsetest saadud punktide summana, millest on maha võetud kahe halvima
// katse tulemused (üksikkatseid on rohkem kui kaks)
// Kirjutada Java-meetod, mis arvutab punktisumma üksikkatsete tulemuste massiivi põhjal.
// Parameetriks olevat massiivi muuta ei tohi.

public class SportlasePunktisumma {

    public static void main(String[] args) {

        int[] score = {2 , 3, 4, 5, 6, 7, 8};

        System.out.println(score(score));

    }

    public static int score(int[] points) {
        int score = 0;
        int min1 = Integer.MAX_VALUE;
        int min1ID = 0;
        int min2 = Integer.MAX_VALUE;


        for (int i=0;i<points.length;i++) {
            if (points[i] < min1) {
                min1 = points[i];
                min1ID = i;
            }
        }

        for (int i=0;i<points.length;i++) {
            if (points[i] < min2 && i != min1ID) {
                min2 = points[i];
            }
        }

        for (int el : points) {
            if (el != min1 && el != min2) {
                score += el;
            }
        }
        return score;
    }
}
