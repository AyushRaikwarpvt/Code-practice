package Coding_Questions.Practice;

public class ReverseString {

    public static void main(String[] args) {

        String input = "Ayush";
        String Reverse = "";
        for (int i = input.length()-1;i>=0;i--){
            Reverse += input.charAt(i);
        }
        System.out.println(Reverse);
    }

}
