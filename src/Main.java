import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int score = 0;

        // Питання 1
        System.out.println("1. _____ she usually go to the gym in the morning?");
        System.out.println("a) Do");
        System.out.println("b) Does");
        System.out.println("c) Is");
        String answer1 = scanner.nextLine();
        if (answer1.equalsIgnoreCase("b")) {
            score++;
        }

        // Питання 2
        System.out.println("2. We _____ football every Saturday.");
        System.out.println("a) play");
        System.out.println("b) plays");
        System.out.println("c) played");
        String answer2 = scanner.nextLine();
        if (answer2.equalsIgnoreCase("a")) {
            score++;
        }

        // Питання 3
        System.out.println("3. They _____ to the movies every weekend.");
        System.out.println("a) go");
        System.out.println("b) goes");
        System.out.println("c) went");
        String answer3 = scanner.nextLine();
        if (answer3.equalsIgnoreCase("a")) {
            score++;
        }

        // Питання 4
        System.out.println("4. He _____ his car every day.");
        System.out.println("a) wash");
        System.out.println("b) washes");
        System.out.println("c) washed");
        String answer4 = scanner.nextLine();
        if (answer4.equalsIgnoreCase("b")) {
            score++;
        }

        // Питання 5
        System.out.println("5. My sister _____ the piano very well.");
        System.out.println("a) play");
        System.out.println("b) plays");
        System.out.println("c) played");
        String answer5 = scanner.nextLine();
        if (answer5.equalsIgnoreCase("b")) {
            score++;
        }

        // Виведення результату
        System.out.println("Your score: " + score + "/5");
    }
}