package STACKS_AND_QUEUES;

import java.util.ArrayDeque;
import java.util.Scanner;

public class _8_Browser_History_Upgrade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String url = sc.nextLine();

        ArrayDeque<String> browserHistory = new ArrayDeque<>();
        ArrayDeque<String> forward = new ArrayDeque<>();

        String last = "";

        while (!url.equalsIgnoreCase("Home")) {

            if (url.equals("back")) {
                if (browserHistory.size() <= 1) {
                    System.out.println("no previous URLs");
                } else {
                     forward.push(browserHistory.pop());
                    System.out.println(browserHistory.peek());
                }
            } else if(url.equals("forward")) {

                if(!forward.isEmpty()){
                    browserHistory.push(forward.peek());
                    System.out.println(forward.pop());
                }else{
                    System.out.println("no next URLs");
                }
            } else {
                browserHistory.push(url);
                forward.clear();
                System.out.println(browserHistory.peek());
            }
            url = sc.nextLine();
        }
    }
}
