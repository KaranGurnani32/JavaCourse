package classesAndObjects;

public class EmployeeRunner {
    public static void main(String[] args) {
//        Employee employee1 = new Employee();
//        Employee employee2 = new Employee("Kanishk", 100, 24, "CTO");
        Employee employee3 = new Employee();
//        Employee alias = employee3;
        Employee copyEmployee = new Employee(employee3);

//        employee1.getDetails("Karan", 12000, 8285, "CEO");
//        employee1.showDetails();
//        employee2.showDetails();
        employee3.getDetails("kunal", 10000, 45, "staff");
        employee3.showDetails();
        copyEmployee.showDetails();
//        alias.showDetails();

    }
}
