package B14;

public class BlueSort {
    public static void blueSort(int [] array){
        for( int i=0; i<array.length-1;i++){
            for ( int j =0; j > i; j--){
                if(array[j] < array[j-1]){
                    int temp = array[j];
                    array[j] = array[j-1];
                    array[j-1] = temp;
                }
            }
        }
    }
}
