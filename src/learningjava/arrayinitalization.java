package learningjava;
import java.util.Scanner;
public class arrayinitalization {
    public static void main(String[] args) {
        //method 1
        int [] hi = new int [5];
            hi[0] = 70;
            hi[1] = 50;
            System.out.println(hi[0]);
            System.out.println(hi[1]);
        //method 2
        int [] si;
        si = new int[5];
        si[0] = 70;
        si[1] = 60;
        System.out.println(si[0]);
        System.out.println(si[1]);
        //
        int [] mo = {60 ,70 ,69, 65};
        System.out.println(mo[0]);
        System.out.println(mo[2]);


//        for each loop to call arrays :-
        for (int element:mo ) {
            System.out.println(element);

        }



    }
}
