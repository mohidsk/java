package practice_sets;
import java.util.Scanner;
public class Mejority_in_array {

//    Main logic method:-
 static int major(int[] arr){
       for(int el : arr){
           System.out.println(el);
       }
        int count = 0;
        int flag;
        for (int i = 1; i <= arr.length; i++) {

            for (int j = 1; j <= arr.length; j++) {

                if (arr[i] == arr[j]) {
                    count++;
                }
            }

        }

        if (count > 0) {
             flag = count;
        } else {
            flag = -1;
        }
        return flag;
   }
// Main method starts:-
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("N = ");
            int n = sc.nextInt();
            int[] arr = new int[n];
            System.out.println("A[] = ");
            for (int i = 1; i <= arr.length; i++) {
                arr[i] = sc.nextInt();
            }
       major(arr);
      //  System.out.println("The mejorety of an array is :"+ans);

        }
}
