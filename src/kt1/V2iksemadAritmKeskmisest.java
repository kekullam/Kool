package kt1;

/**
 * Created by Kerdo Kullam�e on 2.01.2016.
 */

//Koostage Java-meetod, mis leiab etteantud reaalarvude massiivi d p�hjal selliste elementide arvu, mis on rangelt
// v�iksemad k�igi elementide aritmeetilisest keskmisest(aritmeetiline keskmine=summa/el arv)

public class V2iksemadAritmKeskmisest {
    public static void main(String[] args) {
        double[] d = {0.1,0.2,0.3,5.,6.,7.,8.};
        System.out.println(allaKeskmise(d));
        
    }

    public static int allaKeskmise(double[] d ) {
        int sum = 0;
        int count = 0;
        for (double el : d) {
            sum += el;
        }
        int aritKesk = sum / d.length;
        for (double el:d) {
            if (el<aritKesk) {
                count++;
            }
        }
        return count;
    }
}
