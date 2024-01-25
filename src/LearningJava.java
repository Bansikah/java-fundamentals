import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LearningJava {
    public static void main(String[] args){
        System.out.println("What is your name?");

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        System.out.println(input);
        //write some code here
        System.out.println("Noel is a Java developer");

        //Data types
        String c = "text";
        System.out.println(c);
        int x = 5;
        System.out.println(x);
        char y = 'y';
        System.out.println(y);
        boolean b = false; //an alternative is true
        //Comparing two string we use the .equals method
        System.out.println("Hello".equals("Hello"));

        //Comparisons
        System.out.println( 5+5 == 10);//comparison operator
        int d = 7;//assignment operator
        //operators and logical operators
        Scanner scanner1 = new Scanner(System.in);


        int u = scanner1.nextInt();
        int z = scanner1.nextInt();

        if (10 == 10 && z > 9){
            System.out.println("true");
        }

        System.out.println("Guess a password!");
        Scanner scanner2 = new Scanner(System.in);

        String password = scanner2.nextLine();

        while(!password.equals("secretepassword")){
            System.out.println("Incorrect. Try again");
            password = scanner2.nextLine();//This is to stop the while loop from executing
        }

        //For loop
        for(int i = 0; i < 10; i++){
            System.out.println(i);
        }
        //Array
        //String[] names = new String[5];

       // names[0] = "Noel";
        //or we can also do it like this
        String[] names2 = {"Noel", "Hans", "Noella","Joel", "John"};// the array index starts from zero

        //Using for loops with arrays

        String[] names = new String[5];

        Scanner s = new Scanner(System.in);
        for(int i=0; i<5; i++){
            names[i] = s.nextLine();
        }

        //Lists
        List<String> names3 = new ArrayList<String>();
        for(int i=0; i<5; i++){
            names3.add(s.nextLine());
        }

        //Linked Lists

        System.out.println("Finished");
    }
}
