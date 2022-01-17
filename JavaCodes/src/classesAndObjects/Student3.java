package classesAndObjects;

public class Student3 {
    String name;
    int rollNo;
    long phoneNo;
    int address;

    void getDetails(String name, int rollNo, long phoneNo, int address){
        this.name = name;
        this.rollNo = rollNo;
        this.phoneNo = phoneNo;
        this.address = address;
    }

    void showDetails(){
        System.out.println(name);
        System.out.println(rollNo);
        System.out.println(phoneNo);
        System.out.println(address);
    }
}
