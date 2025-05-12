package MuiltiThread;

public class Syncronization {

    int reaming_seat ;
    public void MovieBkingTicket(int seat){
        if (seat <= reaming_seat) {
            reaming_seat = reaming_seat - seat;
            System.out.println("You are booked " + seat + " seat(s).");
            System.out.println("Remaining Seats: " + reaming_seat);
        } else {
            System.out.println("Not enough seats.");
            System.out.println("Remaining Seats: " + reaming_seat);
        }
    }
}

class Test extends  Thread{

    static  Syncronization b;
    int seat;
    @Override
    public void run (){
        b.MovieBkingTicket(seat);
    }

    public static void main(String[] args) {

        b = new Syncronization();

        Test obj = new Test();
        obj.seat = 7;
        obj.start();

        Test obj1 = new Test();
        obj1.seat = 6;
        obj1.start();



    }
}
