package Coding_Questions.Practice;

public class FobenaciSeries {

    public void printFibonacciSeries(int n) {
        int a = 0, b = 1;
        for (int i = 0; i < n; i++) {
            System.out.println(a);
            int next = a + b;
            a = b;
            b = next;
        }
    }


    public static void main(String[] args) {

        FobenaciSeries obj = new FobenaciSeries();
        obj.printFibonacciSeries(20);


    }
}
