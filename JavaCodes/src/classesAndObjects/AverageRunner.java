package classesAndObjects;

public class AverageRunner {
    public static void main(String[] args) {
        Average average = new Average();
        average.getDetails(2, 4, 6);
        System.out.println(average.average());
    }
}
