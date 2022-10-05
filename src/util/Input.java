package util;

import java.util.Scanner;

public class Input {
    private static Scanner scanner = new Scanner(System.in);

    public static String getString() {
        return scanner.nextLine();
    }

    public static boolean yesNo() {
        String userInput = scanner.nextLine();
        return userInput.equalsIgnoreCase("y") || userInput.equalsIgnoreCase("Yes") || userInput.equalsIgnoreCase("True");
    }

    public static int getInt(int min, int max) {
        System.out.printf("Give me a number between %s and %s", min, max);
        int userNum = scanner.nextInt();
        if (userNum < min || userNum > max) {
            getInt(min, max);
        }
        return userNum;
    }

    public static int getInt() {
        return scanner.nextInt();
    }

    public static int getDouble(int min, int max) {
        System.out.printf("Give me a number between %s and %s", min, max);
        double userNum = scanner.nextInt();
        if (userNum < min || userNum > max) {
            getDouble(min, max);
        }
        return (int) getDouble();

    }

    public static double getDouble() {
        return scanner.nextDouble();
    }
}

