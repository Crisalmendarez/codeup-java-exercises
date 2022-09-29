import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {
        boolean conversation = true;
        do{

        Scanner scanner = new Scanner(System.in);

        System.out.println("Talk to Bob.");
        String userInput = scanner.nextLine();

        if(userInput.endsWith("?")){
            System.out.println("Sure");
        } else if (userInput.endsWith("!")) {
            System.out.println("Whoa, Chill out!");
        } else if (userInput.isBlank()) {
            System.out.println("Fine. Be that way!");
        }
        else{
            System.out.println("Whatever.");
        }
        System.out.println("Do you still want to talk to Bob?");
        String userInput2 = scanner.nextLine();
        if(userInput2.equalsIgnoreCase("y")){
            conversation = true;
        }else if(userInput2.equalsIgnoreCase("n")){
            conversation = false;
        }
            }while (conversation == true);
        }
}
