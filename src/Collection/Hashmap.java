package Collection;

import java.util.HashMap;

public class Hashmap {

    public static void main(String[] args) {
        HashMap<Integer, String> Map = new HashMap<>();

        Map.put(1, " Ayush");
        Map.put(2, " Ballu");
        Map.put(3, " Salmon");
        Map.put(4, " Akshit");
        Map.put(5 , "bunty");



        System.out.println(Map);
        String Test = Map.get(4);
        System.out.println(Test);
        System.out.println(Map.containsKey(23));
        System.out.println(Map.containsValue(" Ayush"));

        Map.forEach((key, value) -> System.out.println(key + " = " + value));

    }

}
