package Coding_Questions.Practice;

import java.util.HashSet;

public class Array_Find_Remove_dup {

    public void FindDuplicate(int Arr[]){

        for (int i = 0; i < Arr.length; i++){
            for (int j = i+1;j<Arr.length;j++){
                if (Arr[i] == Arr[j]){
                    System.out.println( Arr[j]+" This is Duplicate in Your Array");
                }
            }
        }
    }
    public void removeDuplicates(int[] arr) {
        int n = arr.length;
        if (n == 0 || n == 1) {
            return;
        }

        int[] temp = new int[n];
        int j = 0;

        for (int i = 0; i < n - 1; i++) {
            if (arr[i] != arr[i + 1]) {
                temp[j++] = arr[i];
            }
        }
        temp[j++] = arr[n - 1];

        for (int i = 0; i < j; i++) {
            System.out.print(temp[i] + " ");
        }
    }

    public  void Optimize_way_remove_Dup(int Arr[]){
        HashSet<Integer> Array_New = new HashSet<>();
        for(int num : Arr){
            Array_New.add(num);
        }
        for (int num : Array_New) {
            System.out.print(num + " ");
        }
    }


    public static void main(String[] args) {
        int Arr[] = new int[]{12, 23, 45, 23, 67, 89, 67, 90};

        Array_Find_Remove_dup obj = new Array_Find_Remove_dup();
//        obj.FindDuplicate(Arr);
//        obj.removeDuplicates(Arr);
        obj.Optimize_way_remove_Dup(Arr);

    }
}
