package MuiltiThread;

class A extends Thread {
    int limit = 5; // default

    public void setLimit(int limit) {
        this.limit = limit;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
        System.out.println("Hello, I am task");

        // Print table using the limit set by B
        for (int i = 1; i <= limit; i++) {
            System.out.println(limit + " * " + i + " = " + (limit * i));
        }
    }
}

class B extends Thread {

    A aThread;

    B(A aThread) {
        this.aThread = aThread;
        setDaemon(true); // Make this thread daemon
    }

    @Override
    public void run() {
        // This thread sets the value for A
        System.out.println("Setting table limit from daemon thread");
        aThread.setLimit(7);
    }
}

public class Sample {
    public static void main(String[] args) {
        A a = new A();
        B b = new B(a); // Pass reference of A to B
        a.setName("AyushiPro");
        b.start(); // Daemon thread runs and sets limit
        try {
            b.join(); // Wait for daemon thread to finish before starting A
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        a.start(); // Start main task threa
        System.out.println("Main thread: " + Thread.currentThread().getName());
    }
}
