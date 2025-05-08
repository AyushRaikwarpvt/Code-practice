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


//    Calculate the sum of numbers from 1 to 100 using a loop.
    void SumFunc(int Start  , int End){
       int count = 0;
        for (int i = Start; i <= End; i++) {
            count = count + i;
        }
        System.out.println("The of Sum Your Given Values " + count);
    }

//    Print the multiplication table of Any number using a for loop.

    void Tablefun(int Tabele){

        for (int i = 1; i <= 10; i++){
            System.out.println( Tabele  +" * "+ i + "= " + Tabele*i);
        }
    }
    //Print all numbers from 10 to 1 in reverse using a loop.
    void ReverseFun(int End){
        for (int i = End; i >= 0; i--) {
            System.out.println("Printing Reverse Gave you Number " +  i );
        }
    }

//    Print only odd numbers from 1 to 20.
    void Printodd(int Range){
        for (int i = 0; i <= Range; i++){
            if (i%2!=0){
                System.out.println("Odd Number in our Range " + i);
            }
        }
    }
//    Find the factorial of a given number (e.g., 5 → 120).
    void FatorialFun(int Fun){
       int count = Fun;
       int res = Fun;
       int temp = 0 ;
        for (int i = Fun; i >= 1; i--) {
            temp = res * i-1;
        }
        System.out.println("That's Fatorial of your Given Number " + temp);
    }


    public static void main(String[] args) {

       Questions obj = new Questions();
       obj.PrintingW(30);
        System.out.println("--------------");
       obj.Printing(20);
        System.out.println("--------------");
        obj.PrintingDow(40);
        System.out.println("--------------");
        obj.SumFunc(1,10);
        System.out.println("--------------");
        obj.Tablefun(10);
        System.out.println("--------------");
        obj.ReverseFun(10);
        System.out.println("--------------");
        obj.Printodd(10);
        System.out.println("--------------");
        obj.FatorialFun(5);
    }

}
