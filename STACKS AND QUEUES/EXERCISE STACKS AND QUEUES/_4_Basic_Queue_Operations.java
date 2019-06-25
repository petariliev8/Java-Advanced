package _3_STACKS_AND_QUEUES.Exercises_Stacks_and_Queues;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

public class _4_Basic_Queue_Operations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayDeque<Integer> queue = new ArrayDeque<>();

        String [] commands = sc.nextLine().split("\\s+");

        int elementsToAdd = Integer.parseInt(commands[0]);
        int elementsToRemove = Integer.parseInt(commands[1]);
        int elementToFind = Integer.parseInt(commands[2]);

        Arrays.stream(sc.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .forEach(e -> queue.add(e));
        while (elementsToRemove-- >0){
            queue.poll();
        }
        if (queue.contains(elementToFind)){
            System.out.println("true");
        }else{
            int min = Integer.MAX_VALUE;
            while (!queue.isEmpty()){
                int current = queue.poll();
                if(current<min){
                    min = current;
                }
            }
            if(min != Integer.MAX_VALUE){
                System.out.println(min);
            }else{
                System.out.println(0);
            }

        }
    }
}
