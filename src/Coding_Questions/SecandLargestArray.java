package Coding_Questions;

public class SecandLargestArray {


    // 👇 Ye function second largest element return karega
    public static void findSecondLargest(int[] arr) {
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





   void SecandLargest(int arr[]){
       int temp;
       for (int i = 0; i < arr.length ; i++) {

           for (int j = i +1; j <arr .length; j++) {

               if (arr[i] < arr[j]){
                   temp = arr[i];
                   arr[i] = arr[j];
                   arr[j] = temp;
               }

           }
       }
       System.out.println("Your Secand largest " + arr[1]);
//       for (int i = 0; i <arr.length; i++) {
//           System.out.println(arr[i]);
//       }
   }

    public static void main(String[] args) {

        int arr[] = {12, 34, 55, 11, 7, 3, 5, 2};

        SecandLargestArray obj = new SecandLargestArray();
        obj.SecandLargest(arr);
        obj.findSecondLargest(arr);

    }
}
