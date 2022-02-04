package classesandobjects2;

public class Student {
    int rollNo;
    String name;

    void insertRecord(int r, String n){
        rollNo = r;
        name = n;
    }

    void displayInfo(){
        System.out.println(rollNo + " " + name);
    }
}

class TestStudent{
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();
        s1.insertRecord(12, "Karan");
        s2.insertRecord(15, "Kanishk");
        s1.displayInfo();
        s2.displayInfo();
    }
}
