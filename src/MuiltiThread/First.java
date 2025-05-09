package MuiltiThread;

public class First extends  Thread{

    public  void run (){
        for (int i = 0; i < 10 ; i++) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        First Tread = new First();
        Tread.start();
        Tread.join();
        for (int i = 11; i < 30 ; i++) {
            System.out.println(i);
        }
//        Thread.sleep(2000);
    }
}
