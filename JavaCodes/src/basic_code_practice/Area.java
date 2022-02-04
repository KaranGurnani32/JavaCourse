package basic_code_practice;

public class Area {
    public static void main(String[] args) {
        System.out.println(area(1,2,3));
        System.out.println(area(1));
        System.out.println(area(1,2));
        System.out.println(area(1,2));
        System.out.println(area(1,2));
    }

    //This is method overloading or overloading
    //Where the name of method is same but
    //input arguments are different
    private static double area(float a, float b, float c) {
        double s = (a + b + c) / 2;
        double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));

        return area;
    }

    private static double area(float length, float breadth) {
        //area of rectangle

        double area = length * breadth;

        return area;
    }

    private static double area(float g) {
        //area of square

        double area = g * g;

        return area;
    }


}
