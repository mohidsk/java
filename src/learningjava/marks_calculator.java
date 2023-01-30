package learningjava;
import java.util.Scanner;
public class marks_calculator {
    public static void main(String[]  args){
        Scanner sub = new Scanner(System.in);
        System.out.println("welcome to marks calculator:- ");
        System.out.println("Enter the total subject marks[100 or 80]");
        int totalsubmarks = sub.nextInt();
        System.out.print("Enter the marks of first subject:- ");
       int  sub1 = sub.nextInt();
        System.out.print("Enter the marks of second subject:- ");
        int sub2 = sub.nextInt();
        System.out.print("Enter the marks of third subject:- ");
        int sub3 = sub.nextInt();
        System.out.print("Enter the marks of fourth subject:- ");
        int sub4 = sub.nextInt();
        System.out.print("Enter the marks of fifth subject:- ");
        int sub5 = sub.nextInt();
        System.out.println("The total parcentage of the subjects are:-");
        int totalsub = sub5+sub1+sub2+sub4+sub3;
        float total = totalsub*100/(totalsubmarks*5);
        System.out.println("Persentage :- "+ total);
        sub.close();

    }
}

