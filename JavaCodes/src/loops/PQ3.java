package loops;

public class PQ3 {
    public static void main(String[] args) {
        //Write a program to find the factorial value of any number entered through the keyboard.

        int fact = 1;
        //for(int i = 1; i<=5; i++){
            //fact = fact*i;
        int i = 1;
        while(i<=5){
            fact = fact*i;
            i++;
        }
        System.out.println(fact);
    }
}
