import java.util.ArrayList;

public class JavaTestReview {
    public static int square(int num) {
        return num * num;
    }

    public static double sum(double num1, double num2 ){
        return num1 + num2;
    }

    public static double sum(int num1, int num2){
        return num1 + num2;
    }

    public static double average(int[] inputArray){
        double total = 0;
        for(int num : inputArray){
            total += num;
        }

        return total/inputArray.length;
    }
    public static void namesToLeet(ArrayList<User>user){
        for(User u : user ){
            u.setFirstName(u.getFirstName().replaceAll("(?i)", "1")
                    .replaceAll("(?i)e","3")
                    .replaceAll("(?i)t","7"));
            u.setLastName(u.getLastName().replaceAll("(?i)", "1")
                    .replaceAll("(?i)e","3")
                    .replaceAll("(?i)t","7"));
        }
    }
}
