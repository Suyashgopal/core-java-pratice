// OOP concepts - classes, objects, encapsulation, inheritance, polymorphism,
// abstraction and interfaces all in one file

// interface for abstraction
interface Vehicle {
    void start();   // abstract method, no body
}

// a normal class with encapsulation (private fields + getters setters)
class Student {
    private String name;
    private int age;

    // setter
    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    // getter
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
}

// parent class for inheritance
class Animal {
    void sound() {
        System.out.println("Some animal sound");
    }
}

// child class extends Animal - this is inheritance
// also overrides sound() which is polymorphism
class Dog extends Animal {
    void sound() {
        System.out.println("Dog says Woof");
    }
}

class Cat extends Animal {
    void sound() {
        System.out.println("Cat says Meow");
    }
}

// class implementing interface
class Car implements Vehicle {
    public void start() {
        System.out.println("Car started with key");
    }
}

public class OOPDemo {
    public static void main(String[] args) {

        // encapsulation
        Student s1 = new Student();
        s1.setName("Rahul");
        s1.setAge(20);
        System.out.println("Student: " + s1.getName() + ", age " + s1.getAge());

        // inheritance + polymorphism
        // parent reference but child object - runtime polymorphism
        Animal a1 = new Dog();
        Animal a2 = new Cat();
        a1.sound();
        a2.sound();

        // abstraction with interface
        Vehicle v = new Car();
        v.start();
    }
}
