package classesAndObjects;

class Employee1{
      int salary;
      String name;

      public int getSalary1(){
          return salary;
      }

      public String getName1(){
          return name;
      }

      public void setName(String n, int salary){
          name = n;
          this.salary = salary;
      }
}

public class cwh_39_youtube {
    public static void main(String[] args) {
        // Problem 1
        Employee1 karan = new Employee1();
        karan.setName("KaranGurnani", 50);
        System.out.println(karan.getSalary1());
        System.out.println(karan.getName1());

    }
}


