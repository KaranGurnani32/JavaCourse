package basicCodes;

import java.util.Scanner;

public class ScannerCase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input your age");

        while (!scanner.hasNextInt()){
            scanner.next();
        }
        int age = scanner.nextInt();

        System.out.println("You are: " + age);
    }
}
