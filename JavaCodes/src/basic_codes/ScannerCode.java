package basic_codes;

import java.util.Scanner;

public class ScannerCode {
    public static void main(String[] args) {
        System.out.println("Taking input from user");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number 1");
        scanner.hasNextInt();
        String a = scanner.nextLine();
//        System.out.println(a);
        System.out.println("Enter number 2");
        String b = scanner.nextLine();
        String sum = a + b;
        System.out.println(sum);
//        boolean b1 = scanner.hasNextInt();
//        System.out.println(b1);
    }
}
