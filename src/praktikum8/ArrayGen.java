package praktikum8;

public class ArrayGen {

	public static void main(String[] args) {
		int[][] matrix = generateMatrix(10, 10);	
		printMatrix(matrix);
		
			
		}
	public static int[][] generateMatrix(int width, int heigth) {
		int[][] matrix = new int[width][heigth];
		for (int i=0; i< width; i++) {
			for (int j=0; j<heigth;j++) {
				matrix[i][j] = (int) (Math.random() * 100);
			}
		}
	return matrix;
	}
	public static void printMatrix(int[][] matrix) {
		for (int[] row : matrix){
			for (int col : row) {
			
				System.out.printf("%2d " ,col);
			}
			System.out.println();
		}
	}

}