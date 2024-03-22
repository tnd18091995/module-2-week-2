package Ex20;

import java.util.Scanner;

public class SortArr {
    public static void main(String[] args) {
        int size;
        int [] arr;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Enter a size: ");
            size = sc.nextInt();
            if(size > 20){
                System.out.println("Please enter Size again! Size <= 20");
            }
        }while(size > 20);
        arr = new int[size];
        int i = 0;
        while (i < arr.length){
            System.out.println("Enter element "+ (i + 1) +": ");
            arr[i] = sc.nextInt();
            i++;
        }

    }
}
