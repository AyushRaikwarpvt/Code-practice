package Collection;

import java.util.LinkedList;
import java.util.List;

//Doubly Linked List ka Structure:
//Node Structure:
//Data: Node ka actual content.
//Next: Reference to the next node.
// Previous: Reference to the previous node.

//Head: LinkedList ka first node (start of the list).
//
//Tail: LinkedList ka last node (end of the list).
//
//In doubly linked lists, each node has a pointer to both
// the next node and the previous node, which allows for easier traversal in both directions.


public class LinkedLists {
    public static void main(String[] args) {

        LinkedList<String> List = new LinkedList<>();

        List.addLast("BuntyKhuni");
        List.add("GotumBaba");
        List.add("SonuDon");
        List.add("AnkushBadmosh");
        List.add("ChandrakntBirthdayBoy");


        System.out.println(List.get(2));
        List.remove();
        List.removeFirst();
        List.removeLast();

        System.out.println(List);
        System.out.println(List.getFirst());
        System.out.println(List.getLast());
        System.out.println(List.size());
        System.out.println(List.isEmpty());
        System.out.println(List.contains("BhaluBHai"));

        List.clear();
        System.out.println(List);


    }
}
