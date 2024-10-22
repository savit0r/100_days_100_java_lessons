import java.util.* ;

public class Assignment_3_1{
    public static void main (String[] args){

        Scanner scanner = new Scanner(System.in);

        //If-Else statement 
        
        System.out.println("-------------------------------------------------");
        System.out.println("Check if the number is positive or negative");
        System.out.println("-------------------------------------------------");

        System.out.println("enter the number :");
        int num = scanner.nextInt();

        if(num > 0){
            System.out.println("The number " + num + " is positive") ;
        }
        else if(num < 0){
            System.out.println("The number " + num + " is negative") ;
        }
        else{
            System.out.println("The number is zero") ;
        }
    }
}