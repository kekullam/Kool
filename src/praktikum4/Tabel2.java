package praktikum4;

import lib.TextIO;

public class Tabel2 {

	public static void main(String[] args) {
		System.out.println("Palun sisesta tabeli suurus:");
		int tabeliSuurus = TextIO.getlnInt();

		for (int i = 0; i < tabeliSuurus * 2 + 4; i++) {
			System.out.print("-");

		}
		System.out.println();

		for (int i = 0; i < tabeliSuurus; i++) {
			System.out.print("| ");
			for (int j = 0; j < tabeliSuurus; j++) {

				if (i == j || i + j == tabeliSuurus - 1)
					System.out.print("x ");
				else
					System.out.print("0 ");
			}
			System.out.println(" |");

		}
		for (int i = 0; i < tabeliSuurus * 2 + 4; i++) {
			System.out.print("-");

		}
		System.out.println();

	}
}
