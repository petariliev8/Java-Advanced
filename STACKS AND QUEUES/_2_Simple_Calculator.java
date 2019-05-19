package STACKS_AND_QUEUES;

import java.util.ArrayDeque;
import java.util.Scanner;

public class _2_Simple_Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        String[] input = sc.nextLine().split(" ");
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        for (int i = 0; i < input.length; i++) {
            if( input[i].equals("-") || input[i].equals("+")){
               if(input[i].equals("-")){
                   stack.push(-Integer.parseInt(input[i+1]));
                   i++;
               }else{
                   stack.push(Integer.parseInt(input[i+1]));
                   i++;
               }
            }else {
                stack.push(Integer.parseInt(input[i]));
            }
        }
        int sum = 0;
        for (int i = 0; !stack.isEmpty(); i++) {

               sum += stack.pop();
        }
        System.out.println(sum);
    }
}
