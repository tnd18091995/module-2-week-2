package Ex20;

import java.util.Scanner;

public class E6 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Nhap so nguyen duong n = ");
        int n = input.nextInt();
        System.out.println(n + " so dau tien trong day fibonaci: ");
        for( int i = 0; i < n; i++){
            System.out.println(fibonaci(i)+" ");
        }
    }
    public static int fibonaci(int n){
        if ( n < 0){
            return -1;
        } else if (n == 0 || n == 1){
            return n;
        }
        else{
            return fibonaci(n - 1 )+fibonaci(n-2);
        }
    }
}
