package Loops;

public class Questions {

    // Print numbers from 1 to 10 using a for loop.
   public void Printing (int End){
        for (int i = 0; i <= End ; i++) {
            System.out.println(i);
        }
    }

    //    Print even numbers between 1 and 20 using a while loop.
    public  void PrintingW (int End){
       int i = 0 ;
       while (i <= End){
           System.out.println(i);
           i++;
       }
    }

//    Print the first 5 natural numbers using a do-while loop.
    public void PrintingDow(int End){
       int i = 0 ;
       do{
           System.out.println(i);
           i++;
       }
       while (i <=End);
    }




    public static void main(String[] args) {

       Questions obj = new Questions();
       obj.PrintingW(30);
        System.out.println("--------------");
       obj.Printing(20);
        System.out.println("--------------");
        obj.PrintingDow(40);

    }

}
