package praktikum6;

import lib.TextIO;
import praktikum5.Meetodid;

public class ArvamisM2ng {

	public static void main(String[] args) {
		int suvalineArv = Meetodid.suvalineArv(1, 100);

		while (true) {
			System.out.println("Arvake ära arvuti mõeldud arv: ");
			
			int arvamus1 = TextIO.getlnInt();

			if (arvamus1 == suvalineArv) {
				System.out.println("Saite arvule pihta");
				break;
			} else if (arvamus1 < suvalineArv) {
				System.out.println("Arvuti arv on suurem");
			} else {
				System.out.println("Arvuti arv on väiksem");

			}

		}
	}
}
