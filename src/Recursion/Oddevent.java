package Recursion;

public class Oddevent {
    public static boolean isEven(int n){
        if(n==0){
            return true;
        }else if(n==1){
            return false;
        }else{
            return isOdd(n-1);
        }
    }
    public static boolean isOdd(int n){
        if(n==0){
            return false;
        }else if(n==1){
            return true;
        }else{
            return isEven(n-1);
        }
    }
    public static void main(String[] args) {
        System.out.println("isOdd(6) = " + isOdd(6));
    }
}
