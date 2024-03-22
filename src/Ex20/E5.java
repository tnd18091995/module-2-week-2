package Ex20;

import java.util.Scanner;

public class E5 {
    public static final char CHAR_55 = 55;
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Nhap so nguyen duong n = ");
        int n = input.nextInt();
//        System.out.println("So " + n + "  he co so 2 = " + input.convertNumber(n, 2));
//        System.out.println("So " + n + "  he co so 16 = " + input.convertNumber(n, 16));
    }

    public static String convertNumber(int n, int b) {
        if (n < 0 || b < 2 || b > 16) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        int m;
        int remainder = n;
        while( remainder > 0){
            if(b>10){
                m = remainder % b;
                if(m >= 10){
                    sb.append((char) (CHAR_55 + m));
                } else{
                    sb.append(m);
                }
            } else{
                sb.append(remainder % b );
            }
            remainder = remainder/b;
        }
        return sb.reverse().toString();
    }
}
