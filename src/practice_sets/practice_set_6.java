package practice_sets;
import java.util.Scanner;

public class practice_set_6 {
    public static void main(String[] args) {
        while (true ) {
            System.out.println("Enter the DAY number to see:-");
            Scanner dat = new Scanner(System.in);
            byte date = dat.nextByte();
            switch (date) {
                case 1 -> System.out.println("monday");
                case 2 -> System.out.println("tuesday");
                case 3 -> System.out.println("wednesday");
                case 4 -> System.out.println("thursday");
                case 5 -> System.out.println("friday");
                case 6 -> System.out.println("saturday");
                case 7 -> System.out.println("sunday");

            }
        }
    }
}
