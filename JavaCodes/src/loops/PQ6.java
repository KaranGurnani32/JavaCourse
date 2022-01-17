package loops;

public class PQ6 {
    public static void main(String[] args) {
        int n = 89;
//        print all the prime numbers till 1000
        int start = (int) System.currentTimeMillis();
        for (int i = 3; i <= 10000000; i++) {
            if(isPrime(i)) {
                System.out.println(i);
            }
        }
        int end = (int) System.currentTimeMillis();
        System.out.println(end - start);
    }

    private static boolean isPrime(int n) {
        //check from 2 to n-1 if any number is divisible or not
        for (int i = 2; i < n; i++) {
            if(n % i == 0) {
                //at any moment if any value of i which are numbers from 2 to n-1 is divisible
                //then it is definitely not prime
                return false;
            }
        }
        //now you have gone through all the iterations(values of i) and not once any value of i
        //was able to divide the number
        //hence the number cannot be divisible by any other number but 1 or the number itself
        //it is a prime number
        return true;
    }
    private static boolean isPrimeBetter(int n) {
        //even number case
        if(n % 2 == 0) {
            return false;
        }

        //check from 2 to n-1 if any number is divisible or not
        for (int i = 3; i <= Math.sqrt(n); i = i + 2) {
            if(n % i == 0) {
                //at any moment if any value of i which are numbers from 2 to n-1 is divisible
                //then it is definitely not prime
                return false;
            }
        }
        //now you have gone through all the iterations(values of i) and not once any value of i
        //was able to divide the number
        //hence the number cannot be divisible by any other number but 1 or the number itself
        //it is a prime number
        return true;
    }
}
