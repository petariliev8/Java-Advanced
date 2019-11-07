package _5_MULTIDIMENSIONAL_ARRAYS;

import java.util.Scanner;

public class _1_Compare_Matrices {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String [] sizeFirst = sc.nextLine().split("\\s+");
        int firstMatrixSize = Integer.parseInt(sizeFirst[0]);
        boolean isEqual = true;




            int[][] firstMatrix = new int[firstMatrixSize][];
            int[][] secondMatrix = new int[firstMatrixSize][];

            for (int i = 0; i < firstMatrixSize; i++) {
                String[] row = sc.nextLine().split("\\s+");
                firstMatrix[i] = new int[row.length];
                for (int i1 = 0; i1 < row.length; i1++) {
                    firstMatrix[i][i1] = Integer.parseInt(row[i1]);
                }
            }


            String[] sizeSecond = sc.nextLine().split("\\s+");
            int secondMatrixSize = Integer.parseInt(sizeFirst[0]);
        if(firstMatrixSize == secondMatrixSize && Integer.parseInt(sizeFirst[1]) == Integer.parseInt(sizeSecond[1]) &&
        Integer.parseInt(sizeFirst[0]) == Integer.parseInt(sizeSecond[0])) {

            for (int i = 0; i < secondMatrixSize; i++) {
                String[] row = sc.nextLine().split("\\s+");
                secondMatrix[i] = new int[row.length];
                for (int i1 = 0; i1 < row.length; i1++) {
                    secondMatrix[i][i1] = Integer.parseInt(row[i1]);
                }
            }

            if (firstMatrixSize == secondMatrixSize) {
                for (int i = 0; i < firstMatrix.length; i++) {
                    for (int i1 = 0; i1 < firstMatrix[i].length; i1++) {
                        if (firstMatrix[i][i1] == secondMatrix[i][i1]) {

                        } else {
                            isEqual = false;
                        }
                    }
                }
            } else {
                isEqual = false;
            }
        }else{
            isEqual = false;
        }

        if(isEqual){
            System.out.println("equal");
        }else{
            System.out.println("not equal");
        }


    }
}
