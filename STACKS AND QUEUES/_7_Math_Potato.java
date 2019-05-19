package STACKS_AND_QUEUES;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class _7_Math_Potato {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String [] names = sc.nextLine().split("\\s+");
        Integer n = sc.nextInt();

        ArrayDeque<String> children = new ArrayDeque<>();
        Collections.addAll(children, names);
        int countCircle = 0 ;

        while (children.size() > 1){
            countCircle++;

            for (Integer i = 1; i < n; i++) {
                String currentChild = children.poll();
                children.offer(currentChild);
            }
            int primeNumber = 0;
            for (int i1 = 1; i1 <= countCircle; i1++) {
                if(countCircle % i1 == 0){
                    primeNumber++;
                }
            }
            if(primeNumber == 2){
                String child = children.peek();
                System.out.println("Prime "+child);
            } else {
                String child = children.poll();
                System.out.println("Removed "+child);
            }
        }
        System.out.println("Last is "+children.peek());
    }
}
