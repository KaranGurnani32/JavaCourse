package basic_codes;

public class Shuffle1 {
    public static void main(String[] args) {
        int x = 3;
        if (x>2){
            System.out.print("a");
        }
        while (x>0) {
            x = x - 1; // isme 3 liya phr 2 lia phr 1 lia tbhi 3 baar "-" aaya

            System.out.print("-");

            if (x == 2) {
                System.out.print("b c");
            }

            if (x == 1) {
                System.out.print("d");
                x = x-1;
            }
        }
    }
}
