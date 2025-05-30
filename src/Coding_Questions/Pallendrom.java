package Coding_Questions;

import com.sun.source.tree.WhileLoopTree;

import java.util.Scanner;

public class Pallendrom {


    public Boolean CheackStringPallendrom(String Str){
        int left = 0 ;
        int right = Str.length() - 1;
        while(left < right){
            if (Str.charAt(left) != Str.charAt(right))
            {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }


    public void CheackPallendronint(int number){
       int temp = number;
       int rem = 0 , rev = 0;
       while (temp!=0){
            rem = temp % 10 ;
            rev = rev * 10 + rem;
            temp = temp / 10;
       }
       if (number == rev){
           System.out.println(number +" Are pallendrom");
       }
       else {
           System.out.println(number+" Are not Pallendrom");
       }
    }

    public static void main(String[] args) {
        String Name = "Ayush ";
        int Age = 1221;



        Pallendrom obj = new Pallendrom();
        System.out.println(obj.CheackStringPallendrom(Name));
        obj.CheackPallendronint(Age);




    }

}
