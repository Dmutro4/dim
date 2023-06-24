import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int score = 0;


        System.out.println("1. _____ she usually go to the gym in the morning?");
        System.out.println("a) Do");
        System.out.println("s) Does");
        System.out.println("d) Is");
        String answer1 = scanner.nextLine();
        if (answer1.equalsIgnoreCase("b")) {
            score++;
        }


        System.out.println("2. We _____ football every Saturday.");
        System.out.println("a) play");
        System.out.println("s) plays");
        System.out.println("d) played");
        String answer2 = scanner.nextLine();
        if (answer2.equalsIgnoreCase("a")) {
            score++;
        }


        System.out.println("3. They _____ to the movies every weekend.");
        System.out.println("a) go");
        System.out.println("s) goes");
        System.out.println("d) went");
        String answer3 = scanner.nextLine();
        if (answer3.equalsIgnoreCase("a")) {
            score++;
        }


        System.out.println("4. He _____ his car every day.");
        System.out.println("a) wash");
        System.out.println("s) washes");
        System.out.println("d) washed");
        String answer4 = scanner.nextLine();
        if (answer4.equalsIgnoreCase("b")) {
            score++;
        }


        System.out.println("5. My sister _____ the piano very well.");
        System.out.println("a) play");
        System.out.println("s) plays");
        System.out.println("d) played");
        String answer5 = scanner.nextLine();
        if (answer5.equalsIgnoreCase("b")) {
            score++;
        }
/// second commit

        System.out.println("Your score: " + score + "/5");
    }
}