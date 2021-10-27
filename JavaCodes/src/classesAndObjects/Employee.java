package classesAndObjects;

public class Employee {

    //empID, name, salary, designation
    //getDetails, showDetails, calculatePayGrade
    String name;
    double salary;
    int empID;
    String designation;

    public Employee() {
        System.out.println("default constructor");
        name = "prateek";
        salary = 12000;
        empID = 24;
        designation = "engineer";
    }

    public Employee(String name, double salary, int empID, String designation) {
        System.out.println("parameterised constructor");
        this.name = name;
        this.salary = salary;
        this.empID = empID;
        this.designation = designation;
    }

    public Employee(Employee employee) {
        System.out.println("Copy constructor");
        this.name = employee.name;
        this.salary = employee.salary;
        this.empID = employee.empID;
        this.designation = employee.designation;
    }

    void getDetails(String name, double salary, int empID, String designation){
        this.name = name;
        this.salary = salary;
        this.empID = empID;
        this.designation = designation;

    }
    void showDetails() {
        System.out.println(name);
        System.out.println(salary);
        System.out.println(empID);
        System.out.println(designation);
    }

    String calculatePayGrade() {
        if(salary<10000) {
            return "D";
        } else if (salary<20000){
            return "C";
        } else if(salary<30000) {
            return"B";
        } else {
            return"A";
        }

    }


}
