package classesAndObjects;

public class StudentRunner {

    public static void main(String[] args) {
        Student student = new Student();

        student.getDetails("kanishk", 25, 12, 69);

        student.showDetails();
    }
}
