package basic_code_practice;

public class Calculate {
    static int cube(int x){
        return x*x*x;
    }

    public static void main(String[] args) {
        int result = Calculate.cube(5);
        int result2 = cube(10);
        System.out.println(result);
        System.out.println(result2);
    }
}
