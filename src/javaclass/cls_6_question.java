package javaclass;
import java.util.Scanner;
public class cls_6_question {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the principal:");
        float p = sc.nextFloat();
        System.out.println("Enter the rate of interest:" );
        float r = sc.nextFloat();
        System.out.println("Enter the time period:");
        float t = sc.nextFloat();
        System.out.println("The simple interest is:"+p*r*t/100);

    }

}
