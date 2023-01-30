package javaclass;

import java.util.*;
import java.lang.*;
public class Cls_11 {
    public static void main(String[] args) {
        double a,b,c;
        double x1,x2,disc;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a,b,c values");
        a=sc.nextDouble();
        b=sc.nextDouble();
        c= sc.nextDouble();
        disc =(b*b)-(4*a*c);
        if(disc==0){
            System.out.println("roots are real and equal");
            x1=x2=-b/(2*a);
            System.out.println("roots are"+x1+","+x2);
        }
        else if(disc>0){
            System.out.println("roots are real and unequal");
            x1 = (-b+Math.sqrt(disc))/(2*a);
            x2 = (b+Math.sqrt(disc))/(2*a);
            System.out.println("roots are"+x1+","+x2);
        }
        else {
            System.out.println("roots are imaginary");
        }
    }
}
