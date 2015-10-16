package praktikum5;

import lib.TextIO;

public class KullJaKiri {

	public static void main(String[] args) {

		int arvutiMyndiVise = Meetodid.suvalineArv(0, 1);
		System.out.println("arvuti arvas: " + arvutiMyndiVise);
		 int kasutajaArvamus = Meetodid.kasutajaSisestus("Sisesta kull (0) või kiri (1)", 0, 1);
		
		if (kasutajaArvamus == arvutiMyndiVise){
			System.out.println("Sina võitsid");
			
		}

	}

	
	
}
