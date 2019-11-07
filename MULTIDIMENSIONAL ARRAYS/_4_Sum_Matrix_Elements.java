package _5_MULTIDIMENSIONAL_ARRAYS;

import java.util.Scanner;

public class _4_Sum_Matrix_Elements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String [] rowColumn = sc.nextLine().split(",\\s+");
        int R = Integer.parseInt(rowColumn[0]);
        int C = Integer.parseInt(rowColumn[1]);
        int [][] matrix = new int[R][C];

        for (int i = 0; i < R; i++) {
            String [] row = sc.nextLine().split(",\\s+");
            for (int i1 = 0; i1 < C; i1++) {
                matrix[i][i1] = Integer.parseInt(row[i1]);
            }
        }
        System.out.println(R);
        System.out.println(C);
        int sum = 0;
        for (int i = 0; i < R; i++) {
            for (int i1 = 0; i1 < C; i1++) {
                sum += matrix[i][i1];
            }
        }
        System.out.println(sum);
    }
}
