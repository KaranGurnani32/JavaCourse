public class Sum3 {
    public static void main(String [] args) {
        int number1 = 8;
        float number2 = 7;
        int sum = (int) (number1 + number2);
        int difference = (int) (number1 - number2);
        int product = (int) (number1 * number2);
        float divison = number1 / number2;
        int remainder = (int) (number1%number2);

        System.out.println("Sum = " + sum);
        System.out.println("Difference = " +difference);
        System.out.println("Product = " +product);
        System.out.println("Division = " +divison);
        System.out.println("Modulus = " +remainder);


    }
}
