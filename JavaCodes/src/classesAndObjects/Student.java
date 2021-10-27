package classesAndObjects;

public class Student {

    //declaration
    private String name;
    private int rollNumber;
    private int standard;
    private float marks;

    // method
    public void getDetails(String name, int rollNumber, int standard, float marks) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.standard = standard;
        this.marks = marks;
    }

    public void showDetails() {
        System.out.println("name : " + this.name);
        System.out.println("roll number  : " + this.rollNumber);
        System.out.println("standard : " + this.standard);
        System.out.println("marks : " + this.marks);
        System.out.println(calculateGrade());
    }

    public String calculateGrade() {
        if(marks>80){
            return "A";
        } else if (marks>70){
            return "B";
        } else if (marks>60){
            return "C";
        } else if (marks>50){
            return "D";
        } else {
            return "F";
        }
    }
}
