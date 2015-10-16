package praktikum5;

import lib.TextIO;

public class ArvuKuup {

	public static void main(String[] args) {
		System.out.println("Sisesta palun arv: ");
		int arv = TextIO.getlnInt();
		System.out.println(arvuKuup(arv));
	}
	
	private static int arvuKuup(int arv) {
		return (int) Math.pow(arv, 3);
		
	}
}
