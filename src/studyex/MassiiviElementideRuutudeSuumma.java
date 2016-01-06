package studyex;

/**
 * Created by Kerdo Kullamäe on 6.01.2016.
 */

// Koostage Java-meetod, mis leiab etteantud massiivi m elementide ruutude summa.
public class MassiiviElementideRuutudeSuumma {

    public static void main(String[] args) {
    int[] m = {2,2,2};
        System.out.println(ruutudeSumma(m));
    }

    public static int ruutudeSumma(int[] m) {
        int summa = 0;
        int arvuRuut;
        for (int i=0; i<m.length;i++) {
            arvuRuut = m[i] * m[i];
            summa += arvuRuut;
        }
        return summa;
    }
}
