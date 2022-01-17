package classesAndObjects;

class MyEmployee{
     int id;
     String name;

     String getName() {
        return name;
    }

     void setName(String name) {
        this.name = name;
    }

     void setId(int id) {
        this.id = id;
    }

     int getID(){
        return id;
    }
}

public class cwh_40_youtube {
    public static void main(String[] args) {
        MyEmployee karan = new MyEmployee();
        karan.setId(42);
        System.out.println(karan.getID());

    }
}
