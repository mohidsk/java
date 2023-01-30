package javaclass;
import java.util.Scanner;
public class cls_4th_question {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to check wether the number is even or odd:");
        int num = sc.nextInt();
        if(num%2==0){
            System.out.println("The "+num+"is even number");
        }
        else {
            System.out.println("The "+num+"is odd number");
        }

    }
}
