package grades;

import java.util.HashMap;
import java.util.Scanner;

public class GradesApplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String, Object> students = new HashMap<>();


        Student leroy = new Student("Leroy");
        leroy.addGrade(90);
        leroy.addGrade(100);
        leroy.addGrade(76);
        students.put("bayernleroy", leroy);

        Student cristian = new Student("Cristian");
        cristian.addGrade(95);
        cristian.addGrade(85);
        cristian.addGrade(75);
        students.put("crisalmendarez", cristian);

        Student cody = new Student("Cody");
        cody.addGrade(99);
        cody.addGrade(72);
        cody.addGrade(93);
        students.put("codypalmer1", cody);

        Student corey = new Student("Corey");
        corey.addGrade(88);
        corey.addGrade(86);
        corey.addGrade(77);
        students.put("coreyosbey", corey);

        System.out.println();
        System.out.println("Here are the GitHub usernames of our students: ");
        System.out.println();
        System.out.println("|bayernleroy| |crisalmendarez| |codypalmer1| |coreyosbey|");
        System.out.println();

        boolean userContinue = false;
        do {
            System.out.println("What student would you like to see more information on?");
            String student = sc.nextLine();

            if (student.equalsIgnoreCase("bayernleroy")) {
                System.out.printf("NAME: %s%n", leroy.getName());
                System.out.printf("GITHUB USERNAME: bayernleroy%n");
                System.out.printf("CURRENT AVERAGE: %.2f%n", leroy.getGradeAverage());
                System.out.println();
            }else if (student.equalsIgnoreCase("crisalmendarez")) {
                System.out.printf("NAME: %s%n", cristian.getName());
                System.out.printf("GITHUB USERNAME: crisalmendarez%n");
                System.out.printf("CURRENT AVERAGE: %.2f%n", cristian.getGradeAverage());
                System.out.println();
            } else if (student.equalsIgnoreCase("codypalmer1")) {
                System.out.printf("NAME: %s%n", cody.getName());
                System.out.printf("GITHUB USERNAME: codypalmer1%n");
                System.out.printf("CURRENT AVERAGE: %.2f%n", cody.getGradeAverage());
                System.out.println();
            } else if (student.equalsIgnoreCase("coreyosbey")) {
                System.out.printf("NAME: %s%n", corey.getName());
                System.out.printf("GITHUB USERNAME: coreyosbey%n");
                System.out.printf("CURRENT AVERAGE: %.2f%n", corey.getGradeAverage());
                System.out.println();
            } else if (!student.equalsIgnoreCase("bayernleroy")|| !student.equalsIgnoreCase("crisalmendarez")|| !student.equalsIgnoreCase("codypalmer1")|| !student.equalsIgnoreCase("coreyosbey")) {
                System.out.printf("Sorry, no student found with the GitHub username of \"%s\"%n", student);
            }

            System.out.println("Would you like to see another student? [y / n]");
            String anotherStudent = sc.nextLine();
            if (anotherStudent.equalsIgnoreCase("y") || anotherStudent.equalsIgnoreCase("yes")) {
                userContinue = true;
            } else if (anotherStudent.equalsIgnoreCase("n") || anotherStudent.equalsIgnoreCase("no")) {
                userContinue = false;
                System.out.println("Goodbye.");
            }
        } while (userContinue);
    }
}


