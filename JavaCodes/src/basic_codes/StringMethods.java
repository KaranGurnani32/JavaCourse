package basic_codes;

public class StringMethods {
    public static void main(String[] args) {
        String name = "Karan";
        System.out.println(name);
//        name = String.valueOf(name.length());
//        System.out.println(name);
        name = name.toLowerCase();
        System.out.println(name);
        name = name.toUpperCase();
        System.out.println(name);

        String nonTrimmedString = "   Karan    ";
        System.out.println(nonTrimmedString);
        System.out.println(nonTrimmedString.trim());

        String subString = name.substring(1, 5);
        System.out.println(subString);
    }
}
