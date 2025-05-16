package Collection;

import java.util.WeakHashMap;

public class WeakedHashmaps {

    public static void main(String[] args) {

        WeakHashMap<Integer, String> list = new WeakHashMap<>();

        list.put(1, "One");
        list.put(2, "Two");

        System.out.println("Map: " + list);
    }
}
