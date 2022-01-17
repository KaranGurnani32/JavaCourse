package basicCodes;

public class EquationSolver {

    public static void main(String[] args) {
        int a, b, c;
        a = 1;
        b = 2;
        c = 1;
        float D = b * b - (4 * c * a);

        float alpha = (float) ((-b - Math.sqrt(D)) / (2 * a));
        float beta = (float) ((-b + Math.sqrt(D)) / (2 * a));
        //ax^2 + bx + c = 0
        // x = alpha and beta

        System.out.println("x = " + alpha + ", " + beta);

    }
}
