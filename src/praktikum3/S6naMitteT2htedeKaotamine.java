package praktikum3;

/**
 * Created by Kerdo Kullamäe on 11.01.2016.
 */
public class S6naMitteT2htedeKaotamine {


    public static void main (String[] args) {
        String s = "Tere, TUDENG, 1234!";
        String t = asenda (s);
        System.out.println (s + " > " + t);
    }

    public static String asenda (String s) {
        StringBuffer k= new StringBuffer();
        for (int i=0; i<s.length();i++)	{
            if (!Character.isLetter(s.charAt(i))){
                k.append('*');
            }
            else {
                k.append(s.charAt(i));
            }
        }
        s=k.toString();
        return s;
    }
}

