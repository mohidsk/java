package javaclass;
import  java.util.Scanner;
public class cls_2nd_question {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number:");
        double num1 = sc.nextDouble();
        System.out.println("Enter the second number:");
        double num2 = sc.nextDouble();
        double sum = num1 + num2;
        System.out.println("The sum of "+num1+"and"+num2+" is "+sum);

    }
}
