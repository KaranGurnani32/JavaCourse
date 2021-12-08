package Arrays;

public class PracticeArray {
    public static void main(String[] args) {
        //initiation
        int [] a = {6,5,4,3,2,1};

        // Empty array
        int[] b = new int [6];
        //[0,0,0,0,0,0]

        //access
        System.out.println(a[0]);
        System.out.println("----------");

        //update
        a[0]= 7;
        a[5]= 2;
        System.out.println(a[0]);
        System.out.println(a[5]);
        System.out.println("-----------");

        //traversal
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
        System.out.println("------------");

        //search
        for (int i = 0; i < a.length; i++) {
            if (a[i] == 2){
                System.out.println("True" + a[i]);
            }
            else {
                System.out.println("False");
            }
        }
        System.out.println("-----------");
        //insert
        printarray(a);
        a = insertatend(a, 75);
        printarray(a);

        a = insertatbeginning(a, 55);
        printarray(a);

        a = insertspecificindex(a, 84, 2);
        printarray(a);

        a = insertafterelement(a, 7, 64);
        printarray(a);

        a = deleteend(a);
        printarray(a);

        a = deletebeginning(a);
        printarray(a);
    }
    private static int [] deletebeginning(int [] a) {
        int [] newA = new int[a.length-1];

        for (int i = 1; i < a.length-1; i++) {
            newA[i-1] = a[i];
        }

        return newA;
    }

    private static int [] deleteend(int [] a) {
        int [] newA = new int[a.length-1];

        for (int i = 0; i < a.length-1; i++) {
            newA[i] = a[i];
        }

        return newA;
    }

    private static int[] insertafterelement(int [] a, int element, int value) {
        boolean found = true;
        int index = 0;

        for (int i = 0; i < a.length; i++) {
            if(a[i]== element) {
                found = true;
                index = i;
                break;
            }
        }

        if(found){
            int [] newA = insertspecificindex(a, value, index+1);
            return newA;
        }
        else{
            System.out.println("element not in array");
            return a;
        }

    }

    private static int[] insertspecificindex(int [] a, int element, int index) {

        if (index<0 || index>a.length){
            System.out.println("invalid index");
        }

        int [] newA = new int[a.length + 1];

        for (int i = 0; i < index; i++) {
            newA[i]= a[i];
        }

        newA[index] = element;

        for (int i = index; i < a.length; i++) {
            newA[i+1] = a[i];

        }

        return newA;
    }

    private static int[] insertatbeginning(int[] a, int element) {
    int [] newA = new int[a.length+1];

        for (int i = 0; i < a.length; i++) {
           newA[i+1] = a[i];
        }
        newA[0] = element;

        return newA;
    }

    //printarraymethod
    private static void printarray(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
        System.out.println("-----------------");
    }

    //insertatend method
    private static int [] insertatend(int [] a, int element){
        int [] newA = new int [a.length + 1];

        for (int i = 0; i < a.length; i++) {
            newA[i]=a[i];
        }
        newA[newA.length-1] = element;

        return newA;
    }
}
