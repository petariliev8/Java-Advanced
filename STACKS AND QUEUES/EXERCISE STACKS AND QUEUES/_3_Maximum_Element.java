package _3_STACKS_AND_QUEUES.Exercises_Stacks_and_Queues;

import java.util.*;

public class _3_Maximum_Element {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = Integer.parseInt(sc.nextLine());
        ArrayDeque<Integer> stack = new ArrayDeque<>();

        for (int i = 0; i < N; i++) {
            String[] commands = sc.nextLine().split("\\s+");

            switch (commands[0]) {
                case "1":
                    stack.push(Integer.parseInt(commands[1]));
                    break;
                case "2":
                    stack.poll();
                    break;
                case "3":
                   int max = Collections.max(stack);
                    System.out.println(max);
                    break;
            }
        }
    }
}
