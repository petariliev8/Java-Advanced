package _3_STACKS_AND_QUEUES.Exercises_Stacks_and_Queues;

import java.text.DecimalFormat;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

public class _5_Roborics {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] infoAboutRobots = sc.nextLine().split(";");

        String[] namesRobots = new String[infoAboutRobots.length];
        int[] workingTime = new int[infoAboutRobots.length];
        int[] processTime = new int[infoAboutRobots.length];

        for (int i = 0; i < infoAboutRobots.length; i++) {
            String[] infoRobotProcessingTime = infoAboutRobots[i].split("-");
            namesRobots[i] = infoRobotProcessingTime[0];
            workingTime[i] = Integer.parseInt(infoRobotProcessingTime[1]);
        }

        int[] timeClock = Arrays.stream(sc.nextLine().split(":"))
                .mapToInt(Integer::parseInt).toArray();
        int timeInSeconds = (timeClock[0] * 60 + timeClock[1]) * 60 + timeClock[2];

        ArrayDeque<String> stack = new ArrayDeque<>();

        String products = sc.nextLine();

        while (!products.equals("End")) {
            stack.offer(products);
            products = sc.nextLine();
        }

        int time = 0;

        while (!stack.isEmpty()) {
            time++;
            String product = stack.poll();
            boolean isAssigned = false;

            for (int i = 0; i < namesRobots.length; i++) {

                if (processTime[i] == 0 && !isAssigned) {
                    processTime[i] = workingTime[i];
                    printTask(namesRobots[i], timeInSeconds + time, product);
                    isAssigned = true;
                    if (stack.isEmpty()) {
                        break;
                    }
                }
                if (processTime[i] > 0) {
                    processTime[i]--;
                }
            }
            if (!isAssigned) {

                stack.offer(product);
            }
        }
    }
    private static void printTask(String namesRobot, int time, String products) {

        int hours = time / 3600;
        if (hours > 23) {
            hours = hours % 24;
        }
        int minutes = (time % 3600) / 60;
        int seconds = time % 60;

        DecimalFormat df = new DecimalFormat("00");

        System.out.println(String.format("%s - %s [%s:%s:%s]", namesRobot, products
                , df.format(hours), df.format(minutes), df.format(seconds)));
    }
}
