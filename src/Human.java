public class Human {

    String name;
    int age;
    int heightInInchies;
    String eyeColor;

    public Human(String name, int age, int heightInInchies, String eyeColor){
        this.name = name;
        this.eyeColor = eyeColor;
        this.heightInInchies = heightInInchies;
        this.age = age;

    }
    public void speak(){
        System.out.println("Hey, my name is "+ name);
        System.out.println("I am "+ age + "years old");
        System.out.println("I am "+ heightInInchies + " Inches tall");
        System.out.println("My eye color is "+ eyeColor);
    }
    public void walk(){
        System.out.println("I can Walk...");
    }
    public void eat(){
        System.out.println("I can Eat...");
    }
    public void work(){
        System.out.println("Working...");
    }
}
