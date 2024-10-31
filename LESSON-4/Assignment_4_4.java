//Method Overload 

public class Assignment_4_4{
    public static void main(String[] args){

        int mul1 = multiply(20,35);
        System.out.println("Multiplication of 20 and 35 is : " + mul1) ;

        int mul2 = multiply(12,23,45);
        System.out.println("Multiplication of 12, 23 and 45 is : "+ mul2) ;
    }
    public static int multiply(int a, int b){
        return a*b ;
    }
    public static int multiply( int a, int b, int c){
        return a*b*c ;
    }

}