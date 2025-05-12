package OOPs;

public class Polly {

    void add(int a , int b ){
        System.out.println(a+b);
    }
    void add(int a, int b,int c){
        System.out.println(a+b+c);
    }
    void add(int a , int b ,int  c , int d){
        System.out.println(a+b+c+d);
    }
    public static void main(String[] args) {
        Polly poll = new Polly();
        poll.add(1,2);
        poll.add(1,2,3);
        poll.add(1,2,3,4);
    }
}
