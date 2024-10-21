public class Assignment1{
    public static void main ( String args[]){

        //Declare Variables
        int age = 34 ;
        double salary = 35456.45 ;
        char grade = 'A' ;
        boolean isEmployed = true ;
        String name = "Rohit Satre" ;

        System.out.println("----------------------- ");

        //Print variables
        System.out.println("Name : " + name);
        System.out.println("Age : " + age);
        System.out.println("Salary : $" + salary);
        System.out.println("Grade : " + grade);
        System.out.println("Employed : " + isEmployed);

        System.out.println("----------------------- ");
        
        //Type Casting 
        //int to double
        double ageAsDouble = age ;
        System.out.println("Age as double :" + ageAsDouble) ;

        System.out.println("----------------------- ");
        
        //Double to int 
        int salaryAsInt = (int) salary ;
        System.out.println("Salary as integer :" + salaryAsInt) ;

        System.out.println("----------------------- ");
    }
}