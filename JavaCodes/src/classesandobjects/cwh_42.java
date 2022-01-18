package classesandobjects;

class MyMainEmployee{
    private int id;
    private String name;

    //public MyMainEmployee(){
      //  id = 44;
        //name = "Karan";
    //}

    public MyMainEmployee(String name2){
      id = 44;
      name = name2;
    }


    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public void setId(int id) { this.id = id; }
    public int getID(){ return id; }
}

public class cwh_42 {
    public static void main(String[] args) {
        MyMainEmployee karan = new MyMainEmployee("Kanishk");
        System.out.println(karan.getName());
        System.out.println(karan.getID());
    }
}
