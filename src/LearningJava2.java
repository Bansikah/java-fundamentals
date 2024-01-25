import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

public class LearningJava2 {

//    public static void main(String[] args){
//        LearningJava2 obj = new LearningJava2();
//        obj.output();
//    }
//    public void output(){
//        System.out.println("We are Learning new stuffs right now!");
//    }
//    public static void main(String[] args){
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("What is your name?");
//        Student student = new Student();
//        student.name = scanner.nextLine();
//        System.out.println("What is your major");
//        student.major = scanner.nextLine();
//    }

    //using a while loop to iterate over the students because i don't know the number of students that might be added
    public static void main(String[] args){
        List<Student> students = new ArrayList<Student>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Do you want to enter an new student? y/n");
        String input = scanner.nextLine();

        while(!input.equals("n")){

            //System.out.println("keep Going");
             System.out.println("What is your name?");
             String name = scanner.nextLine();
             System.out.println("What is your major?");
             String major = scanner.nextLine();
             students.add(student);
            Student student = new Student(name,major);
            System.out.println("Do you want to enter an new student? y/n");
            input = scanner.nextLine();//This is to stop the while loop from continue executing till infinity

        }
        printStudents(students);
    }
    public static void printStudents(List<Student> students){
        for(Student student: students) {
            System.out.println(student.getName() + " " + student.major);
        }
    }
}
