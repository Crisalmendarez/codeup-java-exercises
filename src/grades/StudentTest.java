package grades;

public class StudentTest {

    public static void main(String[] args) {

        Student student1 = new Student("Leroy");
        Student student2 = new Student("Kingsley");


        System.out.println(student1.getName());
        System.out.println(student2.getName());


        student1.addGrade(97);
        student1.addGrade(75);
        student2.addGrade(76);
        student2.addGrade(87);

        System.out.println(student1.getGradeAverage());
        System.out.println(student2.getGradeAverage());


    }
}


