package Collection;

import java.util.NavigableMap;
import java.util.SortedMap;
import java.util.TreeMap;

public class SortedMaps {
    public static void main(String[] args) {
        SortedMap <Integer , String> SortedMap = new TreeMap<>();

        SortedMap.put(12 , "Jonathan");
        SortedMap.put(8 , "Soul");
        SortedMap.put(10 , "Sanax");
        SortedMap.put(9, "ScoutBhai");

        System.out.println(SortedMap);
        System.out.println(SortedMap.headMap(12));
        System.out.println(SortedMap.lastKey());
        System.out.println(SortedMap.tailMap(9));

        System.out.println("--------------------------------------------");

        NavigableMap<Integer , String> NaviMap  = new TreeMap<>();
        NaviMap.put(12 , "Dongesh");
        NaviMap.put(10 ,  "Salman");
        NaviMap.put(9 , "Kancha");
        NaviMap.put(7,"Skinder");

        System.out.println(NaviMap);
        System.out.println(NaviMap.lowerKey(12));
        System.out.println(NaviMap.ceilingKey(12));
        System.out.println(NaviMap.higherKey(9));
        System.out.println(NaviMap.descendingMap());
    }
}
