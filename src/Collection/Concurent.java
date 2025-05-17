package Collection;

import java.util.concurrent.ConcurrentHashMap;

public class Concurent extends  Thread{

    public static void main(String[] args) {

        ConcurrentHashMap<Integer, String> map = new ConcurrentHashMap<>();

        Thread t1  = new Thread(()->{
            for (int i = 0; i < 100 ; i++) {
                map.put(i, "Dongesh");
            }
        });
        Thread t2 = new Thread(()->{
            for (int i = 100; i < 200 ; i++) {
                map.put(i, "Sontosh");
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
        System.out.println(map.size());
    }
}
