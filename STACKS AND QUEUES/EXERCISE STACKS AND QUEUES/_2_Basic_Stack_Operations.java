package _3_STACKS_AND_QUEUES.Exercises_Stacks_and_Queues;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

public class _2_Basic_Stack_Operations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayDeque<Integer> stack = new ArrayDeque<>();

        int [] command = Arrays.stream(sc.nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();
        int N = command[0];
        int S = command[1];
        int X = command[2];

        int [] numbers = Arrays.stream(sc.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt).toArray();

        for (int i = 0; i < numbers.length; i++) {
            stack.push(numbers[i]);
        }

        for (int i = 0; i < S; i++) {
            stack.pop();
        }

        if(stack.contains(X)){
            System.out.println("true");
        }else {
            int smallNumber = Integer.MAX_VALUE;
            for (int i = 0; !stack.isEmpty(); i++) {
                if(smallNumber>stack.peek()){
                    smallNumber=stack.pop();
                }else{
                    stack.pop();
                }
            }
            if(smallNumber==Integer.MAX_VALUE){
                System.out.println(0);
            }else{
                System.out.println(smallNumber);
            }



        }

    }
}
