package STACKS_AND_QUEUES;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Scanner;

public class _6_Hot_Potato {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String [] names = sc.nextLine().split("\\s+");
        Integer n = sc.nextInt();

        ArrayDeque<String> children = new ArrayDeque<>();

        Collections.addAll(children, names);

        while (children.size() > 1){

            for (Integer i = 1; i < n; i++) {
                String currentChild = children.poll();
                children.offer(currentChild);
            }
            String child = children.poll();
            System.out.println("Removed "+child);

        }
        System.out.println("Last is "+children.peek());

    }
}
