package basic_code_practice;

public class Palindrome {
    public static void main(String[] args) {
        int number = 121;
        int temp = number;
        int newNumber = 0;

        while (temp > 0) {
            int remainder = temp % 10;
            temp = temp / 10;
            newNumber = newNumber * 10 + remainder;
        }
        if (newNumber == number){
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }

}
