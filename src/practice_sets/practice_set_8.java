package practice_sets;
import java.util.Scanner;

public class practice_set_8 {
    public static void main(String[] args) {
        while (true)
        {
            System.out.println("Enter your website:-");
            Scanner in = new Scanner(System.in);
            String url = in.next();
            if(url.endsWith(".com")){
                System.out.println("It is a commercial Website ");
            }
            else if(url.endsWith(".org")){
                System.out.println("It is an organizational Website");
            }
            else if(url.endsWith(".in")){
                System.out.println("It is an Indian Website");
            }

        }

    }
}
