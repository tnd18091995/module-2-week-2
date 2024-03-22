package Ex20;

import java.util.ArrayList;
import java.util.List;

public class E1 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        for ( int i = 0; i<201; i++){
            if((i % 7 == 0) && ( i % 5 != 0 )){
                list.add(i);
            }
        }
        showList(list);
    }

    private static void showList(List<Integer> list) {
        if(list != null && !list.isEmpty()){
            int size = list.size();
            for (int i = 0; i < size -1; i++){
                System.out.println(list.get(i)+", ");
            }
            System.out.println(list.get(size -1));
        }
    }
}
