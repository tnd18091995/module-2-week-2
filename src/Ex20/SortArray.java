//package Ex20;
//
//import java.util.Scanner;
//
//public class SortArray {
//    public static Scanner sc = new Scanner(System.in);
//
//    public static void main(String[] args) {
//        System.out.println("Nhập số phần tử của mảng");
//        int n = sc.nextInt();
//        System.out.println("Nhập các phần tử của mảng: \n");
//        for( int i = 0; i < n; i++){
//            System.out.printf("a[%d] = ",i);
//            arr[i] = sc.nextInt();
//        }
//        sortArr(arr);
//        System.out.println("Dãy số được sắp xếp theo thứ tự tăng : ");
//        show(arr);
//    }
//    public static void sortArr(int [] arr){
//        int temp = arr[0];
//        for(int i = 0; i<arr.length -1;i++ ){
//            for(int j =0; j < arr.length;j++){
//                if(arr[i]>arr[j]){
//                    temp = arr[i];
//                    arr[i] = arr[j];
//                    arr[j] = temp;
//                }
//            }
//        }
//    }
//    public static void show(int [] arr){
//        for(int i =0; i < arr.length; i++){
//            System.out.println(arr[i] + " ");
//        }
//    }
//}
