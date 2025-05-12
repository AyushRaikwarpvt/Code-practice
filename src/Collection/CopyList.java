package Collection;

// CopyOnWriteArrayList bhi List interface ko implement karta hai.
// Ye thread-safe hota hai, aur mostly read-heavy situations ke liye use hota hai.
// Har baar jab list modify hoti hai (add/remove), to ek nayi copy ban jaati hai.

import java.util.concurrent.CopyOnWriteArrayList;

public class CopyList {

    public static void main(String[] args) {

        CopyOnWriteArrayList<String> list = new CopyOnWriteArrayList<>();

        list.add("Don");
        list.add("Badmosh");
        list.add("Khuni");
        list.add("Lala");

        list.add(2, "Shera"); // Same as insertElementAt
        list.remove("Don");   // Same as removeElement

        System.out.println(list.get(3));
        System.out.println(list.size());
        System.out.println(list.isEmpty());
        System.out.println(list.contains("papu"));

        System.out.println(list);

        list.clear(); // Clears the list
        System.out.println(list);
    }
}
