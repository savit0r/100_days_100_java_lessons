// Inheritance in Java 

class Person{
    String  name ;
    int age ;
}

class Student extends Person{
    String studentId;

    public void display(){
        System.out.println("Student [Name: " + name + ", Age: " + age + ", StudentId: " + studentId +"]");
    }
} 

public class Assignment_5_2{
    public static void main(String[] args){

        Student student  =  new Student() ;
        student.name = "Gian" ;
        student.age = 35 ;
        student.studentId = "001" ;

        student.display();

    }
}

