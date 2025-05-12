package Collection;

//Java mein Vector ek dynamic array hai, jo elements ko store karta hai. Jaise ArrayList,
// Vector bhi List interface ko implement karta hai. Lekin Vector ka ek major difference
// hai, wo synchronized hota hai. Iska matlab hai ki multiple threads ke saath kaam karte
// waqt, Vector thread-safe hota hai.

import java.util.List;
import java.util.Vector;

public class Verctor {

    public static void main(String[] args) {

        Vector<String> List = new Vector<>();

        List.add("Don");
        List.add("Badmosh");
        List.add("Khuni");
        List.add("Lala");

        List.insertElementAt("Shera" , 2);
        List.removeElement("Don");
        System.out.println(List.get(3));
        System.out.println(List.size());
        System.out.println(List.isEmpty());
        System.out.println(List.contains("papu"));


        System.out.println(List);

        List.clear();
//        List.removeAll();
        System.out.println(List);

    }

}
