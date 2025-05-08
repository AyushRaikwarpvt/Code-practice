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
    void FatorialFun(int Fun) {
            int res = 1;
        for (int i = 1; i <= Fun; i++) {
            res *= i;
        }
        System.out.println(res);
    }
//    Use a loop to count digits in a number (e.g., 12345 → 5 digits).

    void CountFunc(int Range){

       int temp = 0 ;
       int res = 0;
       int copy = Range;

       while (copy!=1){
           res = copy / 10 ;
           copy = res;
           temp++;
       }
        System.out.println(temp + 1);
    }
//    Print the square of numbers from 1 to 10.

    void SqaureFunc(int start , int End){
        for (int i = start; i <= End ; i++) {
            System.out.println( "bhai " + i +"ka Sqaure he => " +  i * i);
        }
    }
//    Print a square pattern of * of size 5×5.
    void Pattern1 (int one , int Two){

        for (int i = 1; i <= Two; i++) {

            for (int j = 0; j < Two; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
//    Print a right-angled triangle pattern of numbers (1 per line).

    void FunRightTrangle(int nol){
        for (int i = 1; i <= nol; i++) {

            for (int j = 1; j <= nol ; j++) {
                if ( j >= 6 - i){
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();

        }
    }
//    Print the sum of even digits in a given number.
    void SumEvenNum(int Range){

       int Sum = 0;
        for (int i = 1; i <= Range ; i++) {
            if (i%2==0){
                Sum += i;
            }
        }
        System.out.println("The Even Number Total is " + Sum);
    }
//    Find the largest number in an array using a loop
    void FindLargest(int Arr[]){
        int temp = Arr[0];
        for (int i =  1; i <  Arr.length  ; i++) {
            if (Arr[i] > temp) {
                temp = Arr[i];
            }
        }
        System.out.println(temp);
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
        System.out.println("--------------");
        obj.CountFunc(18);
        System.out.println("--------------");
        obj.SqaureFunc(1,10);
        System.out.println("--------------");
        obj.Pattern1(5,5);
        System.out.println("--------------");
        obj.FunRightTrangle(5);
        System.out.println("--------------");
        obj.SumEvenNum(10);
        System.out.println("--------------");
        int Arr[] = {10,30,20,90,40,25};
        obj.FindLargest(Arr);


    }

}
