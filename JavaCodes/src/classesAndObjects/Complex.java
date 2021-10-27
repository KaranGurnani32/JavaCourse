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

    public Complex add(Complex complex) {
        Complex sum = new Complex();

        sum.real = this.real + complex.real;
        sum.imaginary = this.imaginary + complex.imaginary;

        return sum;
    }

    public Complex subtract(Complex complex) {
        Complex difference = new Complex();

        difference.real = this.real - complex.real;
        difference.imaginary = this.imaginary - complex.imaginary;

        return difference;
    }

    public Complex multiply(Complex complex) {
        Complex product = new Complex();

        product.real = (this.real * complex.real) - (this.imaginary * complex.imaginary);
        product.imaginary = (this.real * complex.imaginary) + (this.imaginary * complex.real);

        return product;
    }
}
