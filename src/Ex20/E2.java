package Ex20;

import java.util.Scanner;

public class E2 {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Nhap so nguyen duong n = ");
        int n = sc.nextInt();
        System.out.println("Giai thua cua "+n+" la: "+tinhGiaithua(n));
    }

    public static long tinhGiaithua(int n) {
        if(n>0){
            return n * tinhGiaithua(n - 1);
        }
        else {
            return 1;
        }
    }
}
