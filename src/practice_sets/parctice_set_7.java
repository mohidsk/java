package practice_sets;
import  java.util.Scanner;
public class parctice_set_7{
    public static void main (String[] args) {
        while(true) {
            System.out.println("Enter the year:-");
            Scanner yer = new Scanner(System.in);
            int year = yer.nextInt();
            if (year % 4 == 0 && (year % 400 == 0 || year % 100 != 0)) {
                System.out.println("The given year is a leap year ");
            } else {
                System.out.println("The given year is not a leap year ");
            }
        }
    }
}
