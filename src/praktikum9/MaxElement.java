package praktikum9;

public class MaxElement {

	public static void main(String[] args) {
		int[] massiiv = {1, 3, 6, 7, 8, 3, 5, 7, 21, 3};
		System.out.println("Massiivi suurim element on: " + maxValue(massiiv));

	}
	
	public static int maxValue(int[] array) {
		int max = Integer.MIN_VALUE;
		for (int m : array) {
			
			if (m > max) {
				max = m;
			}
		}
		return max;
			
	}

}
