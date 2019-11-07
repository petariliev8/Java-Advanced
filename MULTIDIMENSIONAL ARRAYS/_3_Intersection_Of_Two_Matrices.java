package _5_MULTIDIMENSIONAL_ARRAYS;

import java.util.Scanner;

public class _3_Intersection_Of_Two_Matrices {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int R = Integer.parseInt(sc.nextLine());
        int C = Integer.parseInt(sc.nextLine());

        Character [][] firstMatrix = new Character[R][C];
        Character [][] secondMatrix = new Character[R][C];
        Character [][] thirdMatrix = new Character[R][C];

        for (int i = 0; i < R; i++) {
            String[] element = sc.nextLine().split("\\s+");

            for (int i1 = 0; i1 < C; i1++) {
                firstMatrix[i][i1] = element[i1].charAt(0);
            }
        }
        for (int i = 0; i < R; i++) {
            String[] element = sc.nextLine().split("\\s+");

            for (int i1 = 0; i1 < C; i1++) {
                secondMatrix[i][i1] = element[i1].charAt(0);
            }
        }

        for (int i = 0; i < R; i++) {
            for (int i1 = 0; i1 < C; i1++) {

                if(firstMatrix[i][i1] == secondMatrix[i][i1]){
                    thirdMatrix[i][i1] = firstMatrix[i][i1];
                }else{
                    thirdMatrix[i][i1] = '*';
                }
            }

        }
        for (int i = 0; i < R; i++) {
            for (int i1 = 0; i1 < C; i1++) {
                System.out.print(thirdMatrix[i][i1]+" ");
            }
            System.out.println();
        }

    }
}
