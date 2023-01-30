package javaclass;
import java.util.Scanner;
public class cls_9_question {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to check the factoreal:");
        int fact = sc.nextInt();
        int factorial = facto(fact);
        System.out.println("the factorial of "+fact + " is "+factorial);
    }
    public static int facto(int a){
        int output;
        if(a == 1){
            return 1;
        }
        else{
            output =facto(a-1)*a;
            return output;
        }
    }
}
