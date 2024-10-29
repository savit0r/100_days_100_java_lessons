public class Assignment_4_2{
    public static void main (String[] args){

        int max = findMax(25, 30, 15);
        System.out.println("Maximum of 25, 30, 15 is : " + max) ;
    }

    public static int findMax(int a, int b, int c){
        if(a > b && a > c)
        return a ;
        else if (b > a && b > c)
        return b;
        else
        return c ;
    }
}