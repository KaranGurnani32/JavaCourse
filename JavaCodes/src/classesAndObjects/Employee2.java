package classesAndObjects;

public class Employee2 {
    String name;
    double yearOfJoining;
    String address;

    void getDetails(String name, double yearOfJoining, String address){
        this.name = name;
        this.yearOfJoining = yearOfJoining;
        this.address = address;

    }

    void showDetails(){
        System.out.println(name);
        System.out.println(yearOfJoining);
        System.out.println(address);
    }
}

