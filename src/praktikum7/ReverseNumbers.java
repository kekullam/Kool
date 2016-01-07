package praktikum7;

import lib.TextIO;

public class ReverseNumbers {

	public static void main(String[] args) {
		System.out.println("Enter the number to reverse: ");
		int num = TextIO.getInt();
		int reverse = 0;
		while (num != 0) {
			reverse = reverse * 10;
			reverse = reverse + num%10;
			num = num/10;
		}
		System.out.println(reverse);

	}

}
