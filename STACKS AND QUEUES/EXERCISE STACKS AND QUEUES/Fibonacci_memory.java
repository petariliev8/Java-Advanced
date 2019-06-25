package _3_STACKS_AND_QUEUES.Exercises_Stacks_and_Queues;

import java.util.Scanner;

public class Fibonacci_memory {
    static long[] memory;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());

        memory = new long[n+1];
        long fibo = calcFibo(n);
        System.out.println(fibo);
    }

    private static long calcFibo(int n) {
        if(n<2){
            return 1;
        }
        if(memory[n] != 0){
            return memory[n];
        }
        return memory[n] = calcFibo(n-1)+calcFibo(n-2);

    }
}
