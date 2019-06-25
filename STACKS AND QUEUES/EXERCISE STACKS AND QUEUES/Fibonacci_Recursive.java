package _3_STACKS_AND_QUEUES.Exercises_Stacks_and_Queues;

import java.util.Scanner;

public class Fibonacci_Recursive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());

        int fibo = calcFibo(n);
        System.out.println(fibo);
    }

    private static int calcFibo(int n) {
        if(n<2){
            return 1;
        }
        return calcFibo(n-1)+calcFibo(n-2);
    }
}
