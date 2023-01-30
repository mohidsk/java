package learningjava;
import java.util.Scanner;
public class userinput {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("enter the value in byte:- ");
        byte m = in.nextByte();
      //  System.out.println(m);
        System.out.print("enter the value in float:- ");
        float n = in.nextFloat();
        //System.out.println(n);
        System.out.print("enter the value in double:- ");
        double s = in.nextDouble();
        System.out.println("the input of byte is:- "+m);
        System.out.println("the input of float is:- "+n);
        System.out.println("the input of double is:- "+s);
        in.close();


    }
}
