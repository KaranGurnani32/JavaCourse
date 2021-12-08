package classesAndObjects;

public class Average {
    int a;
    int b;
    int c;

    void getDetails(int a, int b, int c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    int average(){
        int average = (a+b+c)/3;
        return average;
    }

}
