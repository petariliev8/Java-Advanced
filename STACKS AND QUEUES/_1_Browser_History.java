package STACKS_AND_QUEUES;

import java.util.ArrayDeque;
import java.util.Scanner;

public class _1_Browser_History {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String url = sc.nextLine();

        ArrayDeque<String> browserHistory = new ArrayDeque<>();

        while (!url.equalsIgnoreCase("Home")) {

            if (url.equals("back")) {
                if (browserHistory.size() <= 1) {
                    System.out.println("no previous URLs");
                } else {
                    String last = browserHistory.pop();
                    System.out.println(browserHistory.peek());
                }
            } else {
                browserHistory.push(url);
                System.out.println(browserHistory.peek());
            }
            url = sc.nextLine();
        }
    }
}
