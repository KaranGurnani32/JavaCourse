package classesandobjects;

public class Rectangle {
    int length;
    int breadth;
    double Area;

    public Rectangle(int length, int breadth){
        this.length = length;
        this.breadth = breadth;
    }

    void getDetails(int length, int breadth){
        this.length = length;
        this.breadth = breadth;
    }

    public double calculateArea(){
        Area = length*breadth;
        return Area;
    }

    void showDetails(){
        calculateArea();
        System.out.println(Area);

    }
}

