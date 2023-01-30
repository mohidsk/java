package practice_sets;
import java.util.Scanner;
class Empo{
    Scanner sc = new Scanner(System.in);
    String Salary;
    String name;
    public void getName(){
        System.out.println("Enter the employ Name");
        name = sc.nextLine();
    }
    public void getSalary(){
        System.out.println("Enter the employ Salary:-");
        Salary = sc.nextLine();
    }
    public void display(){
        System.out.println("The employ name is:"+name);
        System.out.println("The salary of "+name+" is "+Salary);
    }
}
class Square{
    int square;
    public void area(){
        System.out.println("Area of the Square is :"+square*square);
    }
    public void perimeter(){
        System.out.println("Perimeter of the Square is :"+4*square);
    }
}
class Rectangle{
    int l,b;
    public void area(){
        System.out.println("Area of the rectangle is : "+l*b);
    }
    public void perimeter(){
        System.out.println("Perimeter of the rectangle is : "+2*(l+b));
    }
}
class Circle{
    float radius;
    float pi = 3.1415f;
    public void area(){
        System.out.println("Area of the circle is : "+pi*(radius*radius));
    }
    public void perimeter(){
        System.out.println("Perimeter of the circle is : "+2*pi*radius);
    }
}

public class Practice_Set_Class {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        String rep;
        do {
            System.out.println("What you want:-");
            System.out.println("1.Employ\n2.Square\n3.Reactangle\n4.Circle");
            int s = sc.nextInt();
            switch (s) {
                case 1 -> {
                    Empo p1 = new Empo();
                    p1.getName();
                    p1.getSalary();
                    p1.display();
                }
                case 2 -> {
                    Square sq = new Square();
                    System.out.println("Enter the number for square");
                    sq.square = sc.nextInt();
                    sq.area();
                    sq.perimeter();
                }
                case 3 -> {
                    Rectangle ra = new Rectangle();
                    System.out.println("Enter the length & widt of rectangle : ");
                    ra.l = sc.nextInt();
                    ra.b = sc.nextInt();
                    ra.area();
                    ra.perimeter();
                }
                case 4 -> {
                    Circle c = new Circle();
                    System.out.println("Enter the radius of the circle :");
                    c.radius = sc.nextFloat();
                    c.area();
                    c.perimeter();
                }
                default -> System.out.println("Entered wrong choice...");
            }
            System.out.println("Do you want try again:[Yes||No]");
             rep = sc.next();
        }while (rep.equals("yes")||rep.equals("Yes"));
    }
}
