package STACKS_AND_QUEUES;

import java.util.ArrayDeque;
import java.util.Scanner;

public class _4_Matching_Brackets {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        ArrayDeque<Integer> queue = new ArrayDeque<>();

        for (int i = 0; i < input.length(); i++) {
            if(input.charAt(i)=='(') {
                queue.push(i);
            }else if(input.charAt(i)==')') {
                int openBracket = queue.pop();
                System.out.println(input.substring(openBracket, i+1));
            }
        }

    }
}
