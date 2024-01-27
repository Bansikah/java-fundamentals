public class Earth {
    public static void main(String [] args){
//        Human noel;
//        noel = new Human();
//
//        noel.name = "Noel";
//        noel.eyeColor = "Brown";
//        noel.heightInInchies = 75;
//        noel.age = 21;
//
//        noel.speak();
        Human human1 = new Human("Noel",21, 75, "Brown");
        Human human2 = new Human("Max-Nick", 23, 79, "Blue");

        human1.speak();
        human2.speak();
    }
}
