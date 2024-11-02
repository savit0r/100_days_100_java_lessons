
//creating class and object 
//OOP basics

class Person{
    String name ;
    int age ;

    public void display(){
        System.out.println("person [Name: " + name + ", Age:" + age + "]") ;
    }
}

public class Assignment_5_1{
    public static void main(String[] args){

        Person person = new Person() ;
        person.name = "Alice" ;
        person.age = 23 ;
        person.display();

    }
}