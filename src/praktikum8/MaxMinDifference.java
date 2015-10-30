package praktikum8;


public class MaxMinDifference {
    public static void main(String[] args){

        int[][] matrix = ArrayGen.generateMatrix(4, 4);
        
        ArrayGen.printMatrix(matrix);
        
        System.out.println("\nErinevus: " + maxAndMinDifference(matrix));
    }

    public static int maxAndMinDifference(int[][] matrix){
        int minValue = Integer.MAX_VALUE;
        int maxValue = Integer.MIN_VALUE;
        int difference = 0;
        
        for (int[] row : matrix){
            for (int col : row){
                if(col < minValue){
                    minValue = col;
                }
                if(col > maxValue){
                    maxValue = col;
                }
            }
        }
        difference = maxValue - minValue;
        System.out.println("\n" + maxValue + " - " + minValue + " = " + difference);

        return difference;
    }
}