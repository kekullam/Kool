package kt1;

/**
 * Created by Kerdo Kullam�e on 2.01.2016.
 */

// Kirjutada meetod valiVahemik, mis v�tab �he int t��pi argumendi ja tagastab:
// - Arvu 0, kui argument oli v�iksem kui 10
// - Arvu 1, kui argument oli vahemikus 10-35
// - Arvu 2, kui argument oli suurem kui 35

public class ValiVahemik {

    public static void main(String[] args) {
        System.out.println(valiVahemik(1));
    }

    public static int valiVahemik(int m) {

        if (m>=10 && m<=35) {
            return 1;
        }
        if (m>35) {
            return 2;
        }
        else return 0;
        }
    }

