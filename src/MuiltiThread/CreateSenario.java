package MuiltiThread;

//    performing Single task using Single Thread
//    performing Single task using Muiltiple Thread
//    perfroming muiltiple task using muiltiple Thread


class task1 extends  Thread{
    @Override
    public  void run(){
        System.out.println("task 1 bhiya me ");
    }
}

class  task2 extends  Thread{
    @Override
    public  void run(){
        System.out.println("task 2 bhiya me");
    }
}

class  task3 extends  Thread {
    @Override
    public  void run(){
        System.out.println("task 3 bhiya me");
    }
}

public class CreateSenario {

    public static void main(String[] args) {
        task1 t1 = new task1();
        task2 t2 = new task2();
        task3 t3 = new task3();
        t1.start();
        t2.start();
        t3.start();
    }
}
