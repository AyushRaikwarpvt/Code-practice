package Loops;

public class Questions {

    // Print numbers from 1 to 10 using a for loop.
   public void Printing (int End){
        for (int i = 0; i <= End ; i++) {
            System.out.println(i);
        }
    }

    public  void Printingw (int End){
       int i = 0 ;
       while (i <= End){
           System.out.println(i);
           i++;
       }
    }

//    Print even numbers between 1 and 20 using a while loop.



    public static void main(String[] args) {

       Questions obj = new Questions();
       obj.Printingw(30);
        System.out.println("--------------");
       obj.Printing(20);

    }

}
