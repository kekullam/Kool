package praktikum3;

import lib.TextIO;

public class Parool {

	public static void main(String[] args) {

		int sarv = 0;
		while (true) {

			String parool = "qwerty";

			System.out.println("Sisestage palun parool: ");
			String paroolent = TextIO.getlnString();

			if (parool.equals(paroolent)) {
				System.out.println("Õige parool!");
				return;
			} else {
				System.out.println("Vale parool!");
				sarv = sarv + 1;

			}
			if (sarv >= 3) {
				System.out.println("Sisestasid 3 korda vale parooli! Aitab küll!");
				break;
			}
		}
	}
}
