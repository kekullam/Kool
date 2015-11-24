package praktikum9;

import java.util.ArrayList;
import java.util.Scanner;

public class TulpDiagramm {

	public static Scanner userInput = new Scanner(System.in);

	public static void main(String[] args) {

		ArrayList<Integer> numbrid = new ArrayList<Integer>();

		int number = 1;
		while (number > 0) {
			System.out.println("Sisesta number: ");
			number = getNumber();
			numbrid.add(number);
		}
		if (number == 0) {


		}
		userInput.close();
	}

	public static String arvX(int a) {
		String x = "";
		for (int i = 0; i < a; i++) {
			x += "x";
		}
		return x;

	}

	private static int getNumber() {
		int number = 0;
		number = userInput.nextInt();
		return number;
	}

}
