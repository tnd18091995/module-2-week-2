package Recursion;

public class Recursion {
    static int count = 0;
    static void welcome(){
        count++;
        if(count <=5){
            System.out.println(count +".Hello World");
            welcome();
        }
    }
    public static void main (String [] args){
        welcome();
    }
}
