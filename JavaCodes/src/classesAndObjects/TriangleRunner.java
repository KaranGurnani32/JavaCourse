package classesAndObjects;

public class TriangleRunner {
    public static void main(String[] args) {
        Triangle triangle = new Triangle(3, 4, 5);

        System.out.println(triangle.calculatePerimeter());

        System.out.println(triangle.Area);
        triangle.calculateArea();
        System.out.println(triangle.Area);

    }
}
