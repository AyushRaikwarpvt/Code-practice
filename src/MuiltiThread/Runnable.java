package MuiltiThread;

public class Runnable implements java.lang.Runnable {
    @Override
    public void run() {
        try{
        int a = 0;
        for (int i = 1; i <=10; i++) {

                a = 10 / 0 ;
        }
        }catch (Exception e){
            System.out.println("Bhai Tune Code glti ki h ");
        }
    }

    public static void main(String[] args) throws InterruptedException {

        Runnable obj = new Runnable();

        Thread T1 = new Thread(obj);
            T1.start();         // Start karo pehle
            T1.join();
            // Fir join karo

        for (int i = 0; i <= 10; i++) {
            System.out.println("Hlw This Side vaishu");
        }
    }
}
