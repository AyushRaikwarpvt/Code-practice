package Coding_Questions.Practice;

public class PrimeNumber {
    public boolean cheackPrimeNumbe(int Prime){

        for (int i =2 ; i<= Prime -1;i++){
            if (i % Prime == 0){
                System.out.println(Prime + " Thats Is Not Prime");
                return false;
            }
        }
        return  true;
    }
    public static void main(String[] args) {
        int Number= 7;
        PrimeNumber obj = new PrimeNumber();
        System.out.println(obj.cheackPrimeNumbe(Number));

    }
}
