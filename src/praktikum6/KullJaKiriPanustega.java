package praktikum6;

import lib.TextIO;
import praktikum5.Meetodid;

public class KullJaKiriPanustega {

	public static void main(String[] args) {

		int kasutajaRaha = 100;

		while (true) {

			System.out.println("Sisesta panus (max 25)");
			int panuseSuurus = Meetodid.kasutajaSisestus(1, 25);
			kasutajaRaha -= panuseSuurus;
			int myndiVise = Meetodid.suvalineArv(0, 1);
			if (myndiVise == 0) {
				System.out.println("võitsid, saad raha topelt tagasi!");
				kasutajaRaha += panuseSuurus * 2;
			} else {
				System.out.println("kaotasid...");
				if (kasutajaRaha <= 0) {
					System.out.println("Game over!");
					break;
				}

			}
			System.out.println("sul on " + kasutajaRaha + " raha");
		}
	}
}
