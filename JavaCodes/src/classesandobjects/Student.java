package classesandobjects;

public class Student {
    //properties
    private String name;
    private int rollNumber;
    private int standard;
    private float marks;

    // method
    public void getDetails(String name2, int rollNumber2, int standard2, float marks2) {
        name = name2;
        rollNumber = rollNumber2;
        standard = standard2;
        marks = marks2;
    }

    public void showDetails() {
        System.out.println("name : " + name);
        System.out.println("roll number  : " + rollNumber);
        System.out.println("standard : " + standard);
        System.out.println("marks : " + marks);
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
