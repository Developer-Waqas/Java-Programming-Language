public class Animal {

    String name;
    int age;

    public void eat() {
        System.out.println(name + "is eating");
    }
}

class Dog extends Animal {
    
    void bark() {
        System.out.println("Dog is barking");
    }
    
}
