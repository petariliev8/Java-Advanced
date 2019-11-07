package _5_MULTIDIMENSIONAL_ARRAYS;

import java.util.Arrays;
import java.util.Scanner;

public class _8_Wrong_Measurements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int R = Integer.parseInt(sc.nextLine());
        int [][] matrix = new int[R][];
        int [][] testMatrix = new int[R][];
        int column = 0;

        for (int i = 0; i < R; i++) {
            String [] numbs = sc.nextLine().split("\\s+");
            matrix[i]= new int[numbs.length];
            testMatrix[i]= new int[numbs.length];
            column=numbs.length;
            for (int k = 0; k < numbs.length; k++) {

                matrix[i][k] = Integer.parseInt(numbs[k]);
                testMatrix[i][k] = Integer.parseInt(numbs[k]);
            }
        }
        String[] numbPosition = sc.nextLine().split("\\s+");
        int number = matrix[Integer.parseInt(numbPosition[0])]
                [Integer.parseInt(numbPosition[1])];

        System.out.println(number);
        for (int i = 0; i < R; i++) {
            for (int i1 = 0; i1 < column; i1++) {


            }
        }

        System.out.println(Arrays.deepToString(matrix));
    }
}
