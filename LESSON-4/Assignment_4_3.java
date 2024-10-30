import java.util.* ;
public class Assignment_4_3{
    public static void main(String[] args){

        int num = 11 ;
        boolean prime = isPrime(num);
        System.out.println(num +  " is prime : "+ prime);
    }
    public static boolean isPrime(int a){
        if(a <= 1)
        return false ;

        for(int i = 2; i <= Math.sqrt(a); i++){
            if(a % i == 0) 
            return false ;
        }

        return true ;
    }
}