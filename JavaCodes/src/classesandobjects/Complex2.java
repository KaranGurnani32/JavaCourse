package classesandobjects;

public class Complex2 {
    int real;
    int imaginary;

    public Complex2(){
        real = 0;
        imaginary = 0;
    }

    public Complex2(int real, int imaginary){
        this.real = real;
        this.imaginary = imaginary;
    }

    public void show(){
        System.out.println("(" + real + ") +i(" + imaginary + ")");
    }

}
