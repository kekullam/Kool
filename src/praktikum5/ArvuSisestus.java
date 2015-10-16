package praktikum5;

import lib.TextIO;

public class ArvuSisestus {

	public static void main(String[] args) {
		int kasutajaSisestas = kasutajaSisestus(1, 10);
		System.out.println("kasutajaSisestus meetod tagastas: " + kasutajaSisestas);

	}

	public static int kasutajaSisestus(int min, int max) {

		while (true) {

			System.out.println("Palun sisesta number vahmikus " + min + " kuni " + max);
			int sisestus = TextIO.getInt();
			if (sisestus >= min && sisestus <= max) {
				return sisestus;

			} // if 
			else {
				System.out.println("Vigane sisestus! Proovi uuesti!");
			} // else
		} // while

	} // kasutajaSisestus

}
