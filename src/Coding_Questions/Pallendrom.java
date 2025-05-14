package Coding_Questions;

import java.util.Scanner;

public class Pallendrom {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a Number");
        int num = sc.nextInt() ;
        int temp = num;
        int rev = 0 , rem ;

        while (temp!=0){
            rem = temp % 10 ;
            rev = rev * 10 + rem ;
            temp = temp / 10 ;
        }
        if (rev==num){
            System.out.println(num+ " Your Number Are Pallendrom");
        }
        else {
            System.out.println(num + " Your is Not Pallendrom");
        }


    }

}
