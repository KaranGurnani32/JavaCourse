package classesAndObjects;

public class Complex {

    int real;
    int imaginary;

    public Complex() {
        real = 0;
        imaginary = 0;
    }

    public Complex(int real, int imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public void show() {
        System.out.println("(" + real + ") + i(" + imaginary + ")");
    }

    public Complex add(Complex b) {
        Complex sum = new Complex();

        sum.real = this.real + b.real;
        sum.imaginary = this.imaginary + b.imaginary;

        return sum;
    }

    public Complex subtract(Complex complex) {
        Complex difference = new Complex();

        difference.real = this.real - complex.real;
        difference.imaginary = this.imaginary - complex.imaginary;

        return difference;
    }

    public Complex specialMove(Complex complex) {
        Complex special = new Complex();

        special.real = 2 * complex.imaginary;
        special.imaginary = 80 + complex.real;

        return special;
    }

    public Complex multiply(Complex complex) {
        Complex product = new Complex();

        product.real = (this.real * complex.real) - (this.imaginary * complex.imaginary);
        product.imaginary = (this.real * complex.imaginary) + (this.imaginary * complex.real);

        return product;
    }
}
