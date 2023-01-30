package practice_sets;
import java.text.DecimalFormat;
import java.util.Scanner;
public class Testing {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int java = sc.nextInt();
        int cpp = sc.nextInt();
        int python = sc.nextInt();
        DecimalFormat df = new DecimalFormat("000");
        String javastr = df.format(java);
        String cppstr = df.format(cpp);
        String pythonstr = df.format(python);
        System.out.println("================================");
        System.out.printf("java \t %s\n",javastr);
        System.out.printf("java \t %s\n",cppstr);
        System.out.printf("java \t %s\n",pythonstr);
        System.out.println("================================");

    }
}

