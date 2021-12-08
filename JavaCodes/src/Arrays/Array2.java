package Arrays;

public class Array2 {
    public static void main(String[] args) {
        int [] a = {1,2,3,4,5};

        a = insertatspecificindex(a,55,2);



    }
    public static int [] insertatspecificindex(int [] a, int element, int index){

        if(index<0 || index>a.length){
            System.out.println("invalid index");
            return a;
        }

        int [] newA = new int[a.length + 1];

        for (int i = 0; i < index; i++) {
            newA[i] = a[i];
        }

        newA[index] = element;

        for (int i = index; i < a.length; i++) {
            newA[i+1]=a[i];
        }
        return newA;
    }

}
