package learningjava;

import java.util.Scanner;

public class List {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array size");
        int s = sc.nextInt();
        int []a = new int[s];
        System.out.println("Enter the array Elements");
        for(int i=0; i<a.length; i++) a[i] = sc.nextInt();
       for(int i=a.length; i>0; i--) System.out.print(a[i-1]+" ");
    }
}