package classesAndObjects;

public class Employee2Runner {
    private static final Object C = null;
    private static Object WallsStreet;

    public static void main(String[] args) {
        Employee2 Robert = new Employee2();
        Employee2 Sam = new Employee2();
        Employee2 John = new Employee2();

    Robert.getDetails("Robert", 1994, "64C- WallsStreat");
    Sam.getDetails("Sam", 2000, "69C- WallsStreat");
    John.getDetails("John", 1999, "60C- WallsStreat");

    Robert.showDetails();
    Sam.showDetails();
    John.showDetails();
    }
}
