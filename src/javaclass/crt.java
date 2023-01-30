package javaclass;
import java.util.Scanner;
public class crt {
    public static void main(String[] args) {
        int  div, n;
        int even = 0, odd = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        n = sc.nextInt();
        while (n!=0){
            div = n%10;
            n = n/10;
            // this logic is for to add the digits of even and multply of odd digits in a given number:-
//            if(div%2 == 0){
//                even += div;
//            }
//            else if(div%2!=0){
//                odd *= div;
//            }

            // this logic is to print given number in word form :=
            switch (div){
                case 0 -> System.out.print("zero");
                case 1 -> System.out.print("One");
                case 2 -> System.out.print("Two");
                case 3 -> System.out.print("Three");
                case 4 -> System.out.print("Four");
                case 5 -> System.out.print("Five");
                case 6 -> System.out.print("Six");
                case 7 -> System.out.print("Seven");
                case 8 -> System.out.print("Eight");
                case 9 -> System.out.print("Nine");

            }
        }
//        System.out.println("The addition of even numbers is :- "+even);
//        System.out.println("The Multiplication of odd numbers is :- "+odd);
    }
}
