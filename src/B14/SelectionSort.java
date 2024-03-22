package B14;

public class SelectionSort {
    public static void selectionSort(int [] array){
        int min;
        for( int i = 0; i < array.length -1; i++){
            min = i;
            for( int j = i+1; j < array.length; j++){
                if(array[i]< array[j]) {
                    min = j;
                    if(min !=i){

                    }
                }
            }
        }
    }
}
