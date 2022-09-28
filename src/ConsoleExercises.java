import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {
        double pi = 3.14159;
        System.out.printf("The value of pi is approximately %.2f, \n", pi);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an integer");
        int userInput = scanner.nextInt();
        System.out.println("You entered: --> \"" + userInput + "\" <--");

        System.out.println("Enter Three Words");
        String userInput1 = scanner.next();
        String userInput2 = scanner.next();
        String userInput3 = scanner.next();
        System.out.println("You entered: --> \"" + userInput1 + "\" <--");
        System.out.println("You entered: --> \"" + userInput2 + "\" <--");
        System.out.println("You entered: --> \"" + userInput3 + "\" <--");

        scanner.nextLine();
        System.out.println("Enter a Sentence");
        String userSentence = scanner.nextLine();
        System.out.println("You entered: --> \"" + userSentence + "\" <--");

        System.out.println("What is the width of your class?");
        int width = scanner.nextInt();
        System.out.println("You entered: --> \"" + width + "\" <--");
        System.out.println("What is the length of your class?");
        int length = scanner.nextInt();
        System.out.println("You entered: --> \"" + length + "\" <--");
        System.out.println("The perimeter of your class is");
        System.out.println(width*2 + length*2);
        System.out.println("The area of your class is");
        System.out.println(width * length);

    }
}
