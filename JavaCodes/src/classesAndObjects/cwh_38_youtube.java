package classesAndObjects;

class Newkeyword{
    int id;
    String name;
    int salary;
    public void printdetails(){
        System.out.println("My id is "+ id);
        System.out.println("My name is "+ name);
    }
    public int getSalary(){
        return salary;
    }
}

public class cwh_38_youtube {
    public static void main(String[] args) {

        System.out.println("This is a custom class");
        //Creating or Instantiating a new object called karan and amit
        Newkeyword karan = new Newkeyword();
        Newkeyword amit = new Newkeyword();

        //Setting attributes or properties for karan
        karan.id = 12;
        karan.name = "KaranGurnani";
        karan.salary = 70;

        //Setting attributes or properties for amit
        amit.id = 44;
        amit.name = "AmitKumar";
        amit.salary = 47;

        // id cannot be accessed directly as it was not declared in main method earlier
        // id is declared in main method now along with the new variable karan
        // To access id we created an object earlier with variable karan or declare in main method

        //Printing the attributes
        //System.out.println(karan.id);
        //System.out.println(karan.name);
        karan.printdetails();
        amit.printdetails();
        int salary = amit.getSalary();
        System.out.println(salary);


    }
}
