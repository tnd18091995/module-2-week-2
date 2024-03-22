package Temp;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1,"Jin");
        map.put(2,"Nam");
        map.put(3,"Linh");
        map.put(4,"Lan");
        map.put(5,"Phong");
        System.out.println(map);
        System.out.println(map.get(2));
    }
}
