package learningjava;

import java.util.Scanner;

class Hellow{
    int a;
    int b;
    Hellow(int a){
        this.a = a;
    }
}
class Hi extends Hellow{
    Hi(int a,int b){
        super(a);
        this.b = b;
    }
    public void nam(){
        System.out.println("***AMEGOOO***");
        System.out.println("The value of A is "+a+" The value of B is "+b);
    }
}
public class This_And_Super_Keyword {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b;
        a = sc.nextInt();
        b = sc.nextInt();
    Hi ob = new Hi(a,b);
    ob.nam();
    }
}


