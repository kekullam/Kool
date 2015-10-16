package praktikum2;

import lib.TextIO;

public class T2isarvulineKorrutisJagatis {

	public static void main(String[] args) {
		int arv;
		int suurus;
		System.out.println("Öelge palun inimeste arv:");
		arv = TextIO.getlnInt();
		System.out.println("Öelge palun grupi suurus:");
		suurus = TextIO.getlnInt();
		int jagatis;
		jagatis = (int) Math.floor(arv / suurus);
		
		
		System.out.print("Nendest inimestest saab moodustada ");
		System.out.print(jagatis + " " + "gruppi ");
		int muutuja;
		muutuja = arv % suurus;
		System.out.print("ja üle jääb ");
		System.out.print(muutuja + " " + "inimest");
	

		
	}

}
