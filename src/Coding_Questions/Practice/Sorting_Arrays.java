package Coding_Questions.Practice;

public class Sorting_Arrays {
    public void BoubleSort(int Arr[]){
        int temp ;
        for (int i = 0; i <Arr.length;i++){
            for (int j = i + 1; j <Arr.length ; j++) {
                if (Arr[i] > Arr[j]){
                    temp = Arr[i];
                    Arr[i] = Arr[j];
                    Arr[j] = temp;
                }
            }
        }
        for (int i = 0; i <Arr.length;i++){
            System.out.println(Arr[i]+ " ");
        }
    }
    public static void main(String[] args) {

        int[] Arr = new int[]{12, 23, 32, 12, 14, 1, 5, 6, 11};

        Sorting_Arrays obj = new Sorting_Arrays();
        obj.BoubleSort(Arr);

    }
}
