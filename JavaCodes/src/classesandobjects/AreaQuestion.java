package classesandobjects;

public class AreaQuestion {

    int length;
    int breadth;

    AreaQuestion(int l, int b) {
        length = l;
        breadth = b;
    }

    int returnArea() {
        return length * breadth;
    }
}
