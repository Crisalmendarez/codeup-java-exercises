import java.util.Scanner;
import java.lang.Math;
public class MethodExercises {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println();
        System.out.println(Addition(5,  7));
        System.out.println(Subtraction(5,  7));
        System.out.println(Multiplication(5, 7));
        System.out.println(Division(5, 7));
        System.out.println(Modulus(5, 7));
        getInteger(1,10);

        rollDice(scan);
        HighLow(100);

    }
    public static int Addition(int numbOne, int numbTwo){
        return(numbOne + numbTwo);
    }

    public static int Subtraction(int numbOne, int numbTwo){
        return (numbOne - numbTwo);
    }
    public static int Multiplication(int numbOne, int numbTwo){
        return (numbOne * numbTwo);
    }
    public static int Division(int numbOne, int numbTwo){
        return (numbOne / numbTwo);
    }
    public static int Modulus(int numbOne, int numbTwo){
        return (numbOne - numbTwo);
    }

    public static int getInteger(int min, int max){
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Enter a number between 1 and 10: ");
        int userInput = scanner.nextInt();
        if (userInput > max || userInput < min){
        System.out.printf("Invalid Number please enter a number in range.", min, max);
        return getInteger(min, max);
    }
    System.out.println("You entered " + userInput + "!");
        return userInput;
}
    public static void randomize(int sides) {
        System.out.println((int)Math.floor(Math.random() * sides));
        System.out.println((int)Math.floor(Math.random() * sides));
    }

    public static void rollDice(Scanner scan) {
        while (true){
            System.out.println("Dice Rolling");
            System.out.println("Number of sides: ");
            short sides = Short.parseShort(scan.nextLine());
            randomize(sides);
            System.out.println("Do you want to continue? [Yes / No]");
            if (scan.nextLine().equalsIgnoreCase("n")){
                System.out.println("Thank you for playing, come again soon.");
                break;
            }
        }
    }



    public static int HighLow(int range){
    Scanner scanner = new Scanner(System.in);
        System.out.println("Enter  a number between 1 and 100: ");
        int userInput = scanner.nextInt();
        int guessNumber = (int)Math.floor(Math.random()*range+1);
        if(userInput <= 1 || userInput > 100){
            System.out.println("Your number is not within range. ");
        }
        else{
            if(userInput == guessNumber){
                System.out.println("Good Guess!");
                System.out.printf("Guess number was %d.", guessNumber);
            }
            if(userInput < guessNumber){
                System.out.println("Higher");
                System.out.printf("Guess number was %d.", guessNumber);
            }
            if(userInput > guessNumber){
                System.out.println("Lower");
                System.out.printf("Guess number was %d.", guessNumber);

            }
        }
        return userInput;
    }}

