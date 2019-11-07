package _5_MULTIDIMENSIONAL_ARRAYS;

import java.util.Scanner;

public class _5_Maximum_Sum_Of_2x2_Submatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] rowColumn = sc.nextLine().split(",\\s+");
        int R = Integer.parseInt(rowColumn[0]);
        int C = Integer.parseInt(rowColumn[1]);
        int[][] matrix = new int[R][C];

        for (int i = 0; i < R; i++) {
            String[] row = sc.nextLine().split(",\\s+");
            for (int i1 = 0; i1 < C; i1++) {
                matrix[i][i1] = Integer.parseInt(row[i1]);
            }
        }
        int[][] submatrix = new int[2][2];
        int sum = 0;
        int bestSum = 0;

        for (int i = 0; i < R - 1; i++) {
            for (int i1 = 0; i1 < C - 1; i1++) {
                sum = matrix[i][i1] + matrix[i][i1 + 1] + matrix[i + 1][i1] + matrix[i + 1][i1 + 1];

                if (bestSum < sum) {
                    submatrix[0][0] = matrix[i][i1];
                    submatrix[0][1] = matrix[i][i1 + 1];
                    submatrix[1][0] = matrix[i + 1][i1];
                    submatrix[1][1] = matrix[i + 1][i1 + 1];
                    bestSum = sum;
                }
            }
        }
        for (int i = 0; i < 2; i++) {
            for (int i1 = 0; i1 < 2; i1++) {
                System.out.print(submatrix[i][i1] + " ");
            }
            System.out.println();
        }
        System.out.println(bestSum);
    }
}
