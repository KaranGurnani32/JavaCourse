package classesandobjects;

public class EmployeeRunner {
    public static void main(String[] args) {
        Employee employee1 = new Employee("karan", 100, 24, "LO");
        Employee employee2 = new Employee("Kanishk", 100, 24, "CTO");
        System.out.println(employee1);
        System.out.println(employee2);

//        Employee employee3 = new Employee();
//        Employee alias = employee3;
//        Employee copyEmployee = new Employee(employee3);
//
//        employee1.getDetails("Karan", 12000, 8285, "CEO");
//        employee1.showDetails();
//        employee2.showDetails();
//        employee3.getDetails("kunal", 10000, 45, "staff");
//        employee3.showDetails();
//        copyEmployee.showDetails();
//        alias.showDetails();
//
//        String name;
//        double salary;
//        Integer empID;
//        String designation;
//
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("Enter Name");
//
//        name = scanner.nextLine();
//
//
//        System.out.println("Enter empID");
//
//        empID = scanner.nextInt();
//
//        System.out.println("Enter Designation");
//        scanner.nextLine();
//        designation = scanner.nextLine();
//
//        System.out.println("Enter Salary");
//
//        salary = scanner.nextDouble();
//
//        Employee karan = new Employee(name, salary, empID, designation);
//
//        karan.showDetails();

    }
}
