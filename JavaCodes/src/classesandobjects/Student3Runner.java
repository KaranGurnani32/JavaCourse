package classesandobjects;

public class Student3Runner {
    public static void main(String[] args) {
        Student3 Sam = new Student3();
        Student3 John = new Student3();
        Sam.getDetails("Sam", 54, 8282310360l, 124);
        John.getDetails("John", 22, 8285300360l, 125);

        Sam.showDetails();
        John.showDetails();
    }
}
