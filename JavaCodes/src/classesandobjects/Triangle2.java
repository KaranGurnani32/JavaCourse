package classesandobjects;

class Triangle12{
    int a,b,c;

    public int perimeter(){
        return a+b+c;
    }

    public double area(){
        double s = (a+b+c)/2;
        return Math.sqrt(s * (s-a) * (s-b) * (s-c));
    }
}

public class Triangle2 {
    public static void main(String[] args) {
         Triangle12 triangle = new Triangle12();
         triangle.a = 2;
         triangle.b = 2;
         triangle.c = 2;

        System.out.println(triangle.area());
        System.out.println(triangle.perimeter());
    }


}
