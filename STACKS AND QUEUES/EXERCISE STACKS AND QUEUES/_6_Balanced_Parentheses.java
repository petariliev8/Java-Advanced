package _3_STACKS_AND_QUEUES.Exercises_Stacks_and_Queues;

import java.util.ArrayDeque;
import java.util.Scanner;

public class _6_Balanced_Parentheses {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();

        ArrayDeque<Character> openingBrackets = new ArrayDeque<>();

        boolean isCorrect = true;
        if (input.length() % 2 == 0) {
            for (int i = 0; i < input.length(); i++) {

                if (input.charAt(i) == '('
                        || input.charAt(i) == '{'
                        || input.charAt(i) == '[') {

                    openingBrackets.push(input.charAt(i));

                } else {
                    if (openingBrackets.isEmpty()) {
                        isCorrect = false;
                        break;
                    }
                    if (input.charAt(i) == ')' && openingBrackets.peek() == '(') {
                        openingBrackets.pop();
                    } else if (input.charAt(i) == '}' && openingBrackets.peek() == '{') {
                        openingBrackets.pop();
                    } else if (input.charAt(i) == ']' && openingBrackets.peek() == '[') {
                        openingBrackets.pop();
                    } else {
                        isCorrect = false;
                        break;
                    }
                }
            }
        } else {
            isCorrect = false;
        }
        if (openingBrackets.isEmpty() && isCorrect) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
