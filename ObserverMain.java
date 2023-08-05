package observerDesign;

import java.util.Scanner;

public class ObserverMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inp = "";
        Reporter reporter = new Reporter();
        LiveOne liveOne = new LiveOne();
        LiveTwo liveTwo = new LiveTwo();
        reporter.register(liveOne);
        reporter.register(liveTwo);
        while (true) {
            System.out.print("Enter Score ");
            inp = sc.nextLine();
            if (inp == "")
                break;
            reporter.setScore(inp);
        }
        sc.close();
    }
}
