package classesAndObjects;

public class Area {
    int length;
    int breadth;
    double Area;

    void setDim(int length, int breadth){
        this.length = length;
        this.breadth = breadth;

    }

    double getArea(){
        Area = length*breadth;
        return Area;
    }
}
