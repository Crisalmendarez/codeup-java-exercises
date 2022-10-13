package util;

import java.util.Scanner;

public class Input {
    private static Scanner scanner = new Scanner(System.in);

    public static String getString(String prompt) {
        System.out.println(prompt);
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
        try {
            return Integer.parseInt(getString("Input a number"));
//        return scanner.nextInt();
        } catch (Exception e) {
            System.out.println("Not a number");
            return getInt();
        }
    }

    public static double getDouble(double min, double max) {
        System.out.printf("Give me a number between %s and %s", min, max);
        double userDouble = scanner.nextDouble();
        if (userDouble < min || userDouble > max) {
            userDouble = getDouble(min, max);
        }
        return userDouble;

    }

    public static double getDouble() {
        try {
            return Double.parseDouble(getString("Input a Double: "));
        } catch (Exception e) {
            System.out.println("Not a Double");
            return getDouble();
        }
    }
}
