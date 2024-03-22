package Ex20;

import java.util.Scanner;

public class E7_USCLN_BSCNN {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Nhap so nguyen duong a = ");
        int a = sc.nextInt();
        System.out.println("Nhap so nguyen duong b = ");
        int b = sc.nextInt();
        System.out.println("USCLN cua"+ a +" va"+ b+" la "+ USCLN(a,b));
        System.out.println("BSCNN cua"+ a +" va"+ b+" la "+BSCNN(a,b));
    }

    public static int BSCNN(int a, int b) {
        return a*b/(USCLN(a,b));
    }

    public static int USCLN(int a, int b) {
        if(b == 0) return a;
        return USCLN(b, a % b);
    }
}
