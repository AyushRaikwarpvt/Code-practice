package Collection;

import java.util.HashMap;
import java.util.Hashtable;

public class HashTables extends  Thread{

    public static void main(String[] args) {

//        Map.put(2, "Ayush");
//        Map.put(3, "popcorn");
//        Map.put(5, "Tiger");
//        Map.put(4 , "Sambhu");
//        System.out.println(Map);

        Hashtable<Integer , String> Map  = new Hashtable<>();
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                Map.put(i, "T1");
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 1000; i < 2000; i++) {
                Map.put(i, "T2");
            }
        });

        t1.start();
        t2.start();

        try{
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println(Map.size());







    }

}
