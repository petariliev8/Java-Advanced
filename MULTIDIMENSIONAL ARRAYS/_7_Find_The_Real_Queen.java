package _5_MULTIDIMENSIONAL_ARRAYS;

import java.util.*;

public class _7_Find_The_Real_Queen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int R = 8;
        int C = 8;
        boolean realQueen = true;
        int countQueens = 0;
        Character[][] matrix = new Character[R][C];

        for (int i = 0; i < R; i++) {
            String[] row = sc.nextLine().split("\\s+");
            for (int i1 = 0; i1 < C; i1++) {
                matrix[i][i1] = row[i1].charAt(0);
            }
        }
        Map<Integer, Integer> rowWithOneQueen = new HashMap<>();
        int column = 0;
        for (int i = 0; i < R; i++) {
            for (int i1 = 0; i1 < C; i1++) {
                if (matrix[i][i1] == 'q') {
                    countQueens++;
                    column = i1;
                }
            }
            if (countQueens == 1) {
                rowWithOneQueen.put(i, column);
            }
            countQueens = 0;
            column = 0;
        }
        int diagonalCount = 0;

        Map<Integer, Integer> diagonalsWithOneQueen = new HashMap<>();
        int rowDiagonal = 0;
        int columnDiagonal = 0;
        int countDiagonalQueen = 0;

        for (int i = 1; i <= R; i++) {
            int rows = i;
            int columns = rows;
            for (int n = 1,j=i-1; n <= i; n++,j--) {
                System.out.print(matrix[n-1][j] +" ");
                if(matrix[n-1][j] == 'q'){
                    countQueens++;
                    rowDiagonal = n-1;
                    columnDiagonal = j;
                }
            }

            if(countQueens==1){
                diagonalsWithOneQueen.put(rowDiagonal, columnDiagonal);
            }
            countQueens=0;
            rowDiagonal = 0;
            columnDiagonal =0;
        }

        for (int i = R-1,m=0; i >= 0; i--,m++) {

            for (int n = m,j=R-1; (j>0) && (n+1 <R) ; n++,j--) {
               System.out.print(matrix[n+1][j] +" ");
                if(matrix[n+1][j] == 'q'){
                    countQueens++;
                    rowDiagonal = n+1;
                    columnDiagonal = j;
                }
            }
            if(countQueens==1){
                diagonalsWithOneQueen.put(rowDiagonal, columnDiagonal);
            }
            countQueens=0;
            rowDiagonal = 0;
            columnDiagonal =0;
        }

        for (Map.Entry<Integer, Integer> entry : rowWithOneQueen.entrySet()) {
            if(diagonalsWithOneQueen.containsKey(entry.getKey())){
                if(diagonalsWithOneQueen.containsValue(entry.getValue())){
                    System.out.println(entry.getKey()+" "+entry.getValue());
                }
            }
        }
    }
}
