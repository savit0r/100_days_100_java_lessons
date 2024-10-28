// 26/oct/2024

import java.util.* ;
public class Assignment_3_5{
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in) ;

        // Do While loop (Menu-Driven Program)

        System.out.println("--------------------------------") ;
        System.out.println("Menu-Driven Program") ;
        System.out.println("--------------------------------") ;

        int choice ;

        do {
            System.out.println("Menu : ") ;
            System.out.println("1. Say Hello") ;
            System.out.println("2. Say Goodbye") ;
            System.out.println("3. Exit ") ;
            System.out.println("Enter your choice : ") ;
            choice = scanner.nextInt() ;

            switch (choice){
                case 1 :
                    System.out.println("Hello !") ;
                    break ;
                case 2 :
                    System.out.println("Goodbye !") ;
                    break ;
                case 3 :
                    System.out.println("Exiting...") ;
                    break ;
                default :
                    System.out.println("Invalid choice. try again !") ;
            }
        }
        while(choice != 3);
            scanner.close();


    }
}