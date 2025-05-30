package Coding_Questions.Practice;

public class Arrays_Largest_Smallest {

    public static void findSecondLargestOptmizeway(int[] arr) {
        int firstLargest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > firstLargest) {
                secondLargest = firstLargest;
                firstLargest = arr[i];
            } else if (arr[i] > secondLargest && arr[i] != firstLargest) {
                secondLargest = arr[i];
            }
        }
        System.out.println(secondLargest);
    }

    public  void Smallest(int Arr[]){
        int temp ;
        for (int i = 0; i <Arr.length ;i++){
            for (int j = i+1; j < Arr.length;j++){
                if (Arr[i] > Arr[j]){
                    temp = Arr[i];
                    Arr[i] = Arr[j];
                    Arr[j] = temp;
                }
            }
        }
        System.out.println( Arr[1] + " This Number in Array Are Secand Smallest");
    }
    public void SecandLargest(int Arr[]){
        int temp ;
        for (int i = 0; i <Arr.length ;i++){
            for (int j = i+1; j < Arr.length;j++){
                if (Arr[i] < Arr[j]){
                    temp = Arr[i];
                    Arr[i] = Arr[j];
                    Arr[j] = temp;
                }
            }
        }
        System.out.println( Arr[1] + " This Number in Array Are Secand Largest");
    }

    public static void main(String[] args) {
        int Arr[] = new int[] {12,7,8,3,5,6,78,8,};
        Arrays_Largest_Smallest obj = new Arrays_Largest_Smallest();
        Sorting_Arrays obj1 = new Sorting_Arrays();

        obj1.BoubleSort(Arr);
        obj.Smallest(Arr);
        obj.SecandLargest(Arr);
    }
}
