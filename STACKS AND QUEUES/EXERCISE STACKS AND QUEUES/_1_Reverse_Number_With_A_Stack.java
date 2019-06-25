package _3_STACKS_AND_QUEUES.Exercises_Stacks_and_Queues;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

public class _1_Reverse_Number_With_A_Stack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int [] numbers = Arrays.stream(sc.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt).toArray();

        ArrayDeque<Integer> stack = new ArrayDeque<>();
        for (int i = 0; i < numbers.length; i++) {
            stack.push(numbers[i]);
        }

        for (int i = 0; !stack.isEmpty(); i++) {
            System.out.print(stack.pop()+" ");
        }
    }
}
