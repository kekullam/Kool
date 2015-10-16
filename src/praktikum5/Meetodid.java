package praktikum5;

import lib.TextIO;

public class Meetodid {

    public static void main(String[] argumendid) {
        System.out.println(Meetodid.minuMeetod(3, "Tere veel."));
        int arv = TextIO.getlnInt();
        System.out.println(Math.abs(4));
    }
    
    public static String minuMeetod(int mituKorda, String lisaTekst) {
        String tagastus = "";
        for (int i = 0; i < mituKorda; i++) {
            tagastus += "See tekst on pärist minuMeetod-i seest.\n";
        }
        return tagastus + lisaTekst;
    }




    public static int kasutajaSisestus(int min, int max) {

        int sisestus;
        do {
            System.out.println("Palun sisesta number vahemikus " + min + " kuni " + max);
            sisestus = TextIO.getlnInt();           
        } while (sisestus < min || sisestus > max);
        return sisestus;
    }

	public static int kasutajaSisestus(String tekst, int i, int j) {
		System.out.println(tekst);
		return kasutajaSisestus(i, j);
	}
public static int suvalineArv(int min, int max) {
		
		int vahemik = max - min;
		return min + (int) (Math.random() * (vahemik + 1));
		
	}
}