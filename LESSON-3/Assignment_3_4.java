// 23/oct/2024

import java.util.* ;
public class Assignment_3_4{
    public static void main(String[] args){
        
        Scanner scanner = new Scanner(System.in) ;

        System.out.println("-----------------------------------------") ;
        System.out.println("Calculate Factorial") ;
        System.out.println("-----------------------------------------") ;
        System.out.println("Enter nuber to calculate factorial :") ;
        int num = scanner.nextInt() ;
        long factorial = 1 ;

        int i = 1 ;
        while(i <= num){
            factorial *= i ;
            i++ ;
        }
        System.out.println("Factorial of number " + num + " is " + factorial) ;
    }
}