package basic_codes;

public class Area {

    public static void main(String[] args) {
        System.out.println(area(7, 8));
        System.out.println(area(3, 4, 5) * 2);
    }

    public static double area(float a, float b, float c) {
        double s = (a + b + c) / 2;
        double area = Math.sqrt(s * (s-a) * (s-b) * (s-c));

        return area;
    }

    public static double area(float length, float bredth) {
        //area of rectangle
        double area = (length * bredth);

        return area;
    }

    public static double area(float g) {
        //area of square
        double area = g * g;

        return area;
    }
}
