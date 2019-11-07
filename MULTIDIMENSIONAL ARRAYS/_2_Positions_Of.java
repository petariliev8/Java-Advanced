package _5_MULTIDIMENSIONAL_ARRAYS;

import java.util.Scanner;

public class _2_Positions_Of {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] rowAndColumns = sc.nextLine().split("\\s+");
        boolean notFound = false;
        int R = Integer.parseInt(rowAndColumns[0]);
        int C = Integer.parseInt(rowAndColumns[1]);

        int [][] matrix = new int [R][C];

        for (int i = 0; i < R; i++) {
            String [] row = sc.nextLine().split("\\s+");
            for (int i1 = 0; i1 < row.length; i1++) {
                int numb = Integer.parseInt(row[i1]);
                matrix[i][i1] = numb;
            }
        }
        int numbToFind = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < R; i++) {

            for (int i1 = 0; i1 < C; i1++) {
                int currentNumb = matrix[i][i1];
                if(currentNumb == numbToFind){
                    notFound = true;
                    System.out.println(String.format("%d %d",i,i1));
                }
            }


        }
        if(!notFound){
            System.out.println("not found");
        }
    }
}
