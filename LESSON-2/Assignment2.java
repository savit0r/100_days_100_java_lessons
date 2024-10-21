public class Assignment2 {
    public static void main(String[] args){
        int a = 20 ;
        int b = 5 ;

        // Arithmatic Operators

        System.out.println("------------------------------") ;
        System.out.println("Arithmatic Operators") ;
        System.out.println("------------------------------") ;

        System.out.println("a + b : " + (a + b)) ;
        System.out.println("a - b : " + (a - b)) ;
        System.out.println("a * b : " + (a * b)) ;
        System.out.println("a / b : " + (a / b)) ;
        System.out.println("a % b : " + (a % b)) ;

        //Relational Operators
        System.out.println("------------------------------") ;
        System.out.println("Relational Operators") ;
        System.out.println("------------------------------") ;

        System.out.println("a > b : " + (a > b)) ;
        System.out.println("a < b : " + (a < b)) ;
        System.out.println("a >= b : " + (a >= b)) ;
        System.out.println("a <= b : " + (a <= b)) ;
        System.out.println("a == b : " + (a == b)) ;
        System.out.println("a != b : " + (a != b)) ;

        //Logical Operators

        System.out.println("------------------------------") ;
        System.out.println("Logical Operators") ;
        System.out.println("------------------------------") ;

        boolean c = true ;
        boolean d = false ;
        System.out.println("c && d : " + (c && d)) ;
        System.out.println("c || d : " + (c || d)) ;
        System.out.println("!c : " + (!c)) ;
        System.out.println("!d : " + (!d)) ;

        //Assignment Operators

        System.out.println("------------------------------") ;
        System.out.println("Assignment Operators") ;
        System.out.println("------------------------------") ;

        int x = 10 ;

        x += 5 ; // x = x + 5 -> 15
        System.out.println("x += 5 : " + x) ;

        x -= 5 ; // x = x - 5 -> 5
        System.out.println("x -= 5 : " + x) ;

        x *= 5 ; // x = x * 5 -> 15
        System.out.println("x *= 5 : " + x) ;

        x /= 5 ; // x = x / 5 -> 15
        System.out.println("x /= 5 : " + x) ;

        x %= 5 ; // x = x % 5 -> 15
        System.out.println("x %= 5 : " + x) ;



    }
}