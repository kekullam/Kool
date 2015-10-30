package praktikum8;

import java.util.Arrays;


public class FindMedian {
    public static void main(String[] args){

        int[][] matrix = ArrayGen.generateMatrix(4, 4);
        //prindin algse maatriksi
        ArrayGen.printMatrix(matrix);

        System.out.println();
        for(int element : maxMedianRow(matrix)){
            System.out.print(element + " ");
        }

    }


    public static int[] maxMedianRow(int[][] matrix){
        //suurim mediaanv22rtus
        double maxRowValue = Double.MIN_VALUE;
        //maatrixi rea ID, mille mediaan on suurim
        int maxRowID = 0;

        //loon uue maatrixi, et s2iliks esialgse maatriksi arvude paigutus
        int[][] newArray = matrixCopy(matrix);

        for (int i = 0; i < newArray.length; i++){
            //sordin massiivi elemendid
            Arrays.sort(newArray[i]);

            double curHigh = 0;
            if(newArray[i].length%2 == 0){
                //paaris arv newArray[i]e:
                curHigh = (newArray[i][newArray[i].length/2] + newArray[i][newArray[i].length/2]) / 2;
            }else{
                //paaritu arv newArray[i]e
                curHigh = newArray[i][(int) (Math.round(newArray[i].length/2 - 0.5f)) ];
            }
            if (curHigh > maxRowValue){
                //salvestan uue max v22rtuse
                maxRowValue = curHigh;
                maxRowID = i;
            }

        }

        return matrix[maxRowID];
    }

    private static int[][] matrixCopy(int[][] matrix){
        int[][] newArray = new int[matrix.length][matrix[0].length];
        for(int i = 0; i < newArray.length; i++){
            for(int j = 0; j < newArray[i].length; j++){
                newArray[i][j] = matrix[i][j];
            }
        }
        return newArray;
    }
}