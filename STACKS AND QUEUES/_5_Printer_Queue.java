package STACKS_AND_QUEUES;

import java.util.ArrayDeque;
import java.util.Scanner;

public class _5_Printer_Queue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = "";
        ArrayDeque<String> queue = new ArrayDeque<>();

        while (!"print".equals(input = sc.nextLine())) {

            if (!input.equals("cancel")) {
                queue.offer(input);
            } else {
                if (queue.isEmpty()) {
                    System.out.println("Printer is on standby");
                } else {
                    System.out.println("Canceled " + queue.poll());
                }
            }
        }
        while (!queue.isEmpty()) {
            System.out.println(queue.poll());
        }
    }
}
