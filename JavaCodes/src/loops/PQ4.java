package loops;

public class PQ4 {
    public static void main(String[] args) {
        //Two numbers are entered through the keyboard.
        //Write a program to find the value of one number raised to the power of another. (Do not use Java built-in method)
    int n = 2;
    int e = 3;
    int i = 1;
    int p = 1;
    while(i<=e){
         p= p*n;
         i++;
    }
        System.out.println(p);
    }
}
