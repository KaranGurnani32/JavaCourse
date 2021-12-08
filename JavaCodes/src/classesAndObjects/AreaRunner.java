package classesAndObjects;

public class AreaRunner {
    public static void main(String[] args) {
        Area area = new Area();
        area.setDim(10, 20);
        double Area = area.getArea();
        System.out.println(Area);
    }
}
