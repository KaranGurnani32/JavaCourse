package classesAndObjects;

public class Student2 {
    String name;
    int rollNo;

    void getDetails(String name, int rollNo){
        this.name = name;
        this.rollNo = rollNo;
    }

    void showDetails(){
        System.out.println(name);
        System.out.println(rollNo);
    }
}
