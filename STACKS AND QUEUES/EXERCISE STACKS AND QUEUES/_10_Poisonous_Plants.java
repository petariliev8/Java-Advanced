package _3_STACKS_AND_QUEUES.Exercises_Stacks_and_Queues;

import java.util.*;
import java.util.stream.Collectors;

public class _10_Poisonous_Plants {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = Integer.parseInt(sc.nextLine());

        List<Integer> array = Arrays.stream(sc.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> forRemoveIt = new ArrayList<>();
        int countDays = 0;
        while (true) {
            for (int i = 1; i < array.size(); i++) {

                if (array.get(i - 1) < array.get(i)) {
                    forRemoveIt.add(array.get(i));
                }
            }
            if (forRemoveIt.isEmpty()) {
                System.out.println(countDays);
                break;
            } else {
                for (int i = 0; i < forRemoveIt.size(); i++) {
                    array.remove(forRemoveIt.get(i));
                }
                forRemoveIt.clear();
            }
            countDays++;
        }
    }
}
