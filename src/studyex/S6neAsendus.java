package studyex;

/**
 * Created by Kerdo Kullam�e on 6.01.2016.
 */

// Koostada Java meetod, mis asendab parameetrina etteantud s�nes s k�ik v�iket�hed m�rgiga '-'.
// Lahendus peab kasutama ts�klit.

public class S6neAsendus {

    public static void main(String[] args) {

        String test = "SooKoLL";

        System.out.println(asenda(test));

    }

    public static String asenda(String s) {
        String result ="";

        for (int i=0;i<s.length();i++) {
            char sh = s.charAt(i);
            if(Character.isLowerCase(sh)) {
                result += "-";
            } else {
                result += sh;
            }
        }
        return result;
    }
}
