package practice_sets;
import java.util.Scanner;

public class practice_set_space_checker {
    public static void main(String[] args) {
        Scanner str = new Scanner(System.in);
        System.out.println("Enter the statement:-");
        String  name = str.nextLine();
        int tri = name.indexOf("   ");
        int di = name.indexOf("  ");
        if (tri == -1) {
            System.out.println("it doesn't contains  triple spaces");
        }

        if (tri > 0  || tri == 0){
            System.out.println("It contains triple spaces");
        }
        if(di == -1){
            System.out.println("It doesn't contains double spaces");
        }
        if(di > 0 || di == 0){
            System.out.println("It contains double spaces ");
        }
    }
}
