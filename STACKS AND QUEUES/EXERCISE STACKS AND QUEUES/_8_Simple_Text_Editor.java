package _3_STACKS_AND_QUEUES.Exercises_Stacks_and_Queues;

import java.util.ArrayDeque;
import java.util.Scanner;

public class _8_Simple_Text_Editor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = Integer.parseInt(sc.nextLine());

        ArrayDeque<String> queue = new ArrayDeque<>();
        String text = "";

        for (int i = 0; i < N; i++) {
            String[] operation = sc.nextLine().split("\\s+");
            switch (operation[0]) {
                case "1":
                    text += operation[1];
                    queue.push(text);
                    break;
                case "2":
                    text = text.substring(0, text.length() - Integer.parseInt(operation[1]));
                    queue.push(text);
                    break;
                case "3":
                    int index = Integer.parseInt(operation[1]);
                    System.out.println(text.charAt(index - 1));
                    break;
                case "4":
                    if (queue.size() < 2) {
                        text = "";
                    } else {
                        queue.pop();
                        text = queue.peek();
                    }
                    break;
            }
        }
    }
}
