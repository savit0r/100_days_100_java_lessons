abstract class Animal{
    abstract void makeSound();
}

class Dog extends Animal{
    void makeSound(){
        System.out.println("Dog says: woof!!");
    }
}

class Cat extends Animal{
    void makeSound(){
        System.out.println("Cat says: Meow!!");
    }
}

public class Assignment_5_4{
    public static void main(String[] args){
        Animal dog = new Dog();
        Animal cat = new Cat();

        dog.makeSound();
        cat.makeSound();
    }
}