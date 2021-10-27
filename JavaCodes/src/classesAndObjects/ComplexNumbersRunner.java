package classesAndObjects;

public class ComplexNumbersRunner {
    public static void main(String[] args) {
        Complex a = new Complex(9, 7);
        Complex b = new Complex(4, 6);

        a.show();
        b.show();

        Complex c = a.add(b);
        Complex d = a.subtract(b);
        Complex p = a.multiply(b);

        c.show();
        d.show();
        p.show();
    }
}
