package praktikum12USEFUL;

/**
 * Created by Kerdo Kullamäe on 13.11.2015.
 */
public class Massiiv {

    public static void main(String[] args) {
        int[] neo =
                {1, 1, 1, 1, 1};
        tryki(neo);
        System.out.println(" = " +summa(neo));
    }

    public static void tryki(int[] massiiv) {
        for (int i : massiiv) {
            System.out.print(i + " ");
        }
    }

    public static int summa(int[] massiiv) {
        int sum = 0;
        for (int i : massiiv) {
            sum += i;
        }
        return sum;
    }
}
