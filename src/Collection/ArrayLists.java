package Collection;
//Resizable array jaisa structure jo fast access deta
// hai, lekin middle me insert/delete slow hota hai
//Java ke andar ArrayList ek normal array ka hi wrapper hai.
//Jab list full ho jaati hai, to naya array create hota hai jiska size ~1.5x hota hai,
// aur purane data ko copy kar diya jaata hai (costly operation).
//Default capacity: 10

//Method	Purpose
//        add()	Add item to end
//        add(index, val)	Insert at specific index
//        get(index)	Access value by index
//        set(index, val)	Update value at index
//        remove(index)	Remove by index
//        contains(val)	Check if value exists
//        size()	Total elements
import java.util.ArrayList;
import java.util.List;

public class ArrayLists {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        list.add("Ayush Raikwar");
        list.add("Varun kashyap");
        list.add("Kirten Kashyap");
        list.add("Yash kashyap");

        list.add(1,"vaibhav Raikwar");
        list.set(3,"Kirten Maltej");
        list.remove(2);
        System.out.println(list);
        System.out.println(list.get(3));
        System.out.println(list.contains("Ayush Raikwar"));
        System.out.println(list.size());
    }
}
