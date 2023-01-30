package javaclass;
import java.util.Scanner;
public class cls_10_question {
    public static void main(String[] args) {
        /*System.out.println("Area of the rectangle");
         Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the rectangle:");
        double length = sc.nextDouble();
        System.out.println("Enter the width of the rectangle:");
        double width = sc.nextDouble();
        double areaofrectangle = length*width;
        System.out.println("The area of the rectangle is :"+areaofrectangle);*/
        System.out.println("Area of the triangle");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the height of the rectangle:");
        double height = sc.nextDouble();
        System.out.println("Enter the width of the rectangle:");
        double width = sc.nextDouble();
        double areaofrectangle = (width*height)/2;
        System.out.println("The area of the triangle is :"+areaofrectangle);
    }
}
