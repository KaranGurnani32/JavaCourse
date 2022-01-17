package classesAndObjects;

public class Dog {
    int size;
    String breed;
    String name;

    void bark(){
        System.out.println("Ruff! Ruff!");
    }
    void getName(){
        System.out.println("Dog name is: " + name);
    }
}

class DogRuneer{
    public static void main(String[] args) {
        Dog d = new Dog();
        d.size = 40;
        d.name = "Bozo";
        d.getName();
        d.bark();
    }
}
