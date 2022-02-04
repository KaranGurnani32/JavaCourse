package basic_code_practice;

public class Static_Keyword {
    int rollNo; //instance variable
    String name;
    static String college = "COE"; //static variable

    //constructor
    Static_Keyword (int r, String n){
        rollNo = r;
        name = n;
    }

    static void changeCollege(){
        college = "MAT";
    }

    //method to display values
    void display(){
        System.out.println(rollNo + " " + name + " " + college);
    }
}

class TestStaticVariable{
    public static void main(String[] args) {
        Static_Keyword.changeCollege();
        Static_Keyword s1 = new Static_Keyword(12, "Karan");
        Static_Keyword s2 = new Static_Keyword(15, "Kanishk");

        s1.display();
        s2.display();
    }
}
