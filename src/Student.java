public class Student {
    private String name;
    String major;

    String getName(){
        return name;
    }
    void setName(String name){
        this.name = name;
    }
    //Creating a constructor
     Student(String name, String major){
        setName(name);
        this.major = major;
     }
}
