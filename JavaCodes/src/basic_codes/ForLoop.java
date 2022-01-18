package basic_codes;

public class ForLoop {
    public static void main(String [] args){
        int number = 11511;
        int temp = number;
        int newnumb = 0;

        while(temp>0) {
            int remainder = temp%10;
            temp = temp/10;
            newnumb = newnumb*10 + remainder;
        }


        System.out.println(newnumb);
        if(number == newnumb){
            System.out.println("its a panendrom");
        } else {
            System.out.println("its not a panendrom");
        }
}
}