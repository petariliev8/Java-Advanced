package _5_MULTIDIMENSIONAL_ARRAYS;

import java.util.Scanner;

public class _6_Print_Diagonals_Of_Square_Matrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int R = Integer.parseInt(sc.nextLine());
        int C = R;
        int[][] matrix = new int[R][C];


        for (int i = 0; i < R; i++) {
            String[] row = sc.nextLine().split("\\s+");
            for (int i1 = 0; i1 < C; i1++) {
                matrix[i][i1] = Integer.parseInt(row[i1]);
            }
        }


        for (int i = 0; i < R; i++) {
            System.out.print(matrix[i][i] +" ");
        }
        System.out.println();
        for (int i = 0,j=R-1; i < R; i++,j--) {
            System.out.print(matrix[j][i] +" ");
        }
    }
}
