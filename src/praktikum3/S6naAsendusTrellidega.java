package praktikum3;

/**
 * Created by Kerdo Kullamäe on 11.01.2016.
 */
public class S6naAsendusTrellidega {

    public static void main (String[] args) {
        String s = "Tere, 1234 ja 5678";
        String t = asenda (s); // \"Tere, #### ja ####\"
        System.out.println (s + " --> " + t);
    }

    public static String asenda (String s) {
        return s.replaceAll("[0-9]", "#");
    }

}
