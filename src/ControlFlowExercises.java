import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        int i = 5;
//        while (i <= 15) {
//            System.out.println("i is " + i);
//            i++;
//        }

//        int i = 2;
//        do{
//            System.out.println(i = i * i);
//        }while(i < 10000);
//}}
//         for(long i = 2; i < 1000000; i *= i ){
//             System.out.println(i);
//         }
//         }
//    }


//        for(int i = 1; i <= 100; i++){
//            if(i % 3 == 0){
//                System.out.println("Fizz");
//            }else if(i % 5 == 0){
//                System.out.println("Buzz");
//            }else if(i % 15 == 0){
//                System.out.println("FizzBuzz");
//            }else{
//                System.out.println(i);
//            }
//        }
//    }

        boolean keepGoing = false;
        do {

            System.out.println("Enter a number: ");
            int userNum = scanner.nextInt();

            System.out.println("Number | Squared | Cubed");
            System.out.println("------ - ------- - -----");
            for (int i = 1; i <= userNum; i++) {
                System.out.printf("%d | %d | %d%n", i, i * i, i * i * i);
            }
            scanner.nextLine();
            System.out.println("Would you like to do yet more math?");
            String userAnswer = scanner.nextLine();

            if (userAnswer.equalsIgnoreCase("yes")) {
                keepGoing = true;
            }
        } while (keepGoing);

        do {
            System.out.println("Enter a grade: ");
            int userNum = scanner.nextInt();

            if (userNum >= 88 && userNum <= 97) {
                System.out.println("You got an A!");
            } else if (userNum >= 80 && userNum <= 87) {
                System.out.println("You got an B!");
            } else if (userNum >= 67 && userNum <= 79) {
                System.out.println("You got an C!");
            } else if (userNum >= 60 && userNum <= 66) {
                System.out.println("You got an D!");
            } else if (userNum < 60) {
                System.out.println("You got an F!");
            } else if (userNum >= 99 && userNum <= 100) {
                System.out.println("You got an A+!");
            }

            scanner.nextLine();
            System.out.println("Would you like to do yet more math?");
            String userAnswer = scanner.nextLine();
            if (userAnswer.equalsIgnoreCase("yes")) {
                keepGoing = true;
            }
        } while (keepGoing);
    }
}