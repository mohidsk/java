package practice_sets;
import java.util.Scanner;
public class practice_set_arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //1. sum numbers by using Arrays:-
//    float sum = 0;
//    float []add = {59.4f,6.4f,48.2f,29.4f,399.4f};
//        for ( float element:add)
//        {
//           sum += element;
//        }
//        System.out.println(sum);


        //2. To check the given integer is present in that array or no:-
//        int num = sc.nextInt();
//        int arr[] = {55 , 58 ,44, 22,5,6,9,3};
//        for(int i = 0 ; i <= arr.length;i++){
//            if(arr[i] == num){
//                System.out.println("yes");
//            }
//
//        }
//        for (int element:arr) {
//            if(element == num){
//                System.out.println("yes");
//            }
//
//        }


//        3.Calculate the average marks from an array containing marks of all students in physics using a for-each loop.:-
        //     int sum=0 ;
        //   float avg=0;
        // System.out.println("Enter array size:");
        //int size = sc.nextInt();
//        int[] arr ={57, 66,88 ,44,22} ;
//      for(var i = 0; i <= size ; i++){
//            System.out.println("Enter elements in array:");
//            arr[i] = sc.nextInt();
//        }
//        for (int element : arr) {
//            sum += element;
//            avg = (float) (sum/5);
//        }
//        System.out.println(avg);


        // 4.Create a Java program to add two matrices of size 2x3.:-
//
//              int[][] arr1 = {{4, 5, 6},
//                  {8, 7, 2}};
//        int[][] arr2 = {{2, 1, 7},
//                {3, 7, 4}};
//        int[][] sum = new int[2][3];
//        for (int i = 0; i < arr1.length; i++) {
//            for (int j = 0; j < arr1[i].length; j++) {
//                sum[i][j] = arr1[i][j] + arr2[i][j];
//                System.out.print(sum[i][j] + " ");
//            }
//        System.out.println(" ");


        //  5.create a java program to print an array from riverse order:-
        int[] arr = {3,5,6,2};
        int temp;
        int l = arr.length;
        int n = Math.floorDiv(l,2);
        for(int i=0; i<n ; i++){
            temp = arr[i];
            arr[i] = arr[l-i-1];
            arr[l-i-1] = temp;
        }
        for(int element : arr) {
            System.out.println(element);
        }

    }
}
