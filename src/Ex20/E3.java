package Ex20;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class E3 {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Nhap so nguyen duong n: ");
        int n = sc.nextInt();
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for( int i = 0; i < n + 1; i++){
            map.put(i, i*i);
        }
        System.out.println(map);
    }
}
