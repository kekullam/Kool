package praktikum2;

import lib.TextIO;

public class Korrutis {

	public static void main(String[] args) {
		int arv;
		int arv2;
		System.out.println("Kahe arvu korrutis!");
		System.out.println("Palun sisesta esimene arv:");
		arv = TextIO.getlnInt();
		System.out.println("Palun sisesta teine arv:");
		arv2 = TextIO.getlnInt();
		System.out.println("Nende arvude korrutis on:");
		System.out.println(arv * arv2);

	}

}
