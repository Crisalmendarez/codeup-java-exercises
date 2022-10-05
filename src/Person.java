import java.util.Scanner;

public class Person {
    private String name;

    public Person(String name){
        this.name = name;
    }


    public String getName(){
        return this.name;
//TODO: return the person's name
    }

    public void setName(String name){
//TODO: change the name field to the passed value
        this.name = name;
    }
    public void sayHello(){
//TODO: print a message to the console using the person's name
        System.out.println("Hello " + this.name);
    }

    public static void main(String[] args) {
        Person henry = new Person("henry");

        System.out.println(henry.getName());
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your new name?");
        String newName = scanner.nextLine();
        henry.setName(newName);
        henry.sayHello();
    }
}

