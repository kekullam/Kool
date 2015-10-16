package praktikum3;

import lib.TextIO;

public class Tehisintellekt {

	public static void main(String[] args) {

		System.out.println("Sisesta palun esimene vanus: ");
		int arv = TextIO.getlnInt();

		System.out.println("Sisesta palun teine vanus: ");
		int arv2 = TextIO.getlnInt();

		if (Math.abs(arv - arv2) > 10) {
			System.out.println("Kle proovi veel!");
		}

		if (Math.abs(arv - arv2) > 5) {
			System.out.println("Saamatu oled ikka!");
		} else {
			System.out.println("Korras!");
		}
	}
}
