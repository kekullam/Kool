package praktikum9;

public class MaxElementMatrix {

	public static void main(String[] args) {
		int[][] neo = {
			    {1, 3, 6, 7},
			    {2, 3, 3, 1},
			    {17, 4, 5, 0},
			    {-20, 13, 16, 17}
			};
		
		System.out.println("Maatriksi maksimaalne element on: " + maxValue(neo));
	}

	public static int maxValue(int[][] matrix) {
		int maxVal = Integer.MIN_VALUE;
		for (int[] row : matrix) {
			for (int col : row) {
				if (col > maxVal) {
					maxVal = col;
				}
			}
		}
		return maxVal;
	}
}
