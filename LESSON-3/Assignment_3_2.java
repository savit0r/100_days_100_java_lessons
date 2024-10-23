//23/oct/2024

import java.util.*;

public class Assignment_3_2{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in) ;

        //Switch Statement

        System.out.println("--------------------------------");
        System.out.println("Simple calculator");
        System.out.println("--------------------------------");

        System.out.println("Enter the first number : ") ;
        double first = scanner.nextDouble();
        System.out.println("Enter the second number : ") ;
        double second = scanner.nextDouble();

        System.out.println("Enter the Operator (+, -, *, /) : ") ;
        char operator = scanner.next().charAt(0);
        double result ;

        switch (operator){
            case '+':
            result = first + second ;
            System.out.println("Result : " + result ) ;
            break ;

            case '-':
            result = first - second ;
            System.out.println("Result : " + result ) ;
            break ;

            case '*':
            result = first * second ;
            System.out.println("Result : " + result ) ;
            break ;

            case '/':
            result = first / second ;
            System.out.println("Result : " + result ) ;
            break ;

            default :
            System.out.println("Invalid Operator") ;
        }
    }
}