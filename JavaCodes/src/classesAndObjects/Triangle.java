package classesAndObjects;

public class Triangle {
    int side1;
    int side2;
    int side3;
    double Area;
    double Perimeter;

    public Triangle(int side1, int side2, int side3){
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
//        calculatePerimeter();
//        calculateArea();
    }

    double calculatePerimeter(){
        Perimeter = side1+side2+side3;
        return Perimeter;
    }

    double calculateArea(){
        double s = (side1 + side2 + side3) / 2;
        Area = Math.sqrt(s * (s-side1) * (s-side2) * (s-side3));

        return Area;
    }

}
