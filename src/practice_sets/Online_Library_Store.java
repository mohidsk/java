package practice_sets;
import java.util.Scanner;
interface members {
    Scanner sc = new Scanner(System.in);
    String[] addbooks = new String[100];
    String[] issuedbooks = new String[100];
    String[] returnebooks = new String[100];
}
class Library implements members  {
    public void addBooks() {
        int i = 0;
        System.out.println("Enter the Name of the Book to Add");
        String b;
        do {
            addbooks[i] = sc.nextLine();
            i++;
            System.out.println("Do you want to add anathor book[y/n]");
            b = sc.next();
        } while (b.equals("y") || b.equals("Y"));
    }

    public void issuedBooks() {
        int check = 0;
        System.out.println("Enter the book name you want");
       sc.nextLine();
        String book = sc.nextLine();
        for (int i = 0; i <= 100; i++) {
            if (addbooks[i].equals(book)) {
                issuedbooks[i] = book;
                check++;
                break;
            }
        }
        if (check > 0) {
            System.out.println(book + " Book was issued to you");
        } else System.out.println("Sorry we can't find " + book + " book in our store");
    }

    public void returnables() {
        int i;
        System.out.println("-:Enter the book name you want to return:-");
        String returnee = sc.nextLine();
        for ( i = 0; i <= 100; i++) {
            if (issuedbooks[i].equals(returnee)) {
                returnebooks[i] = returnee;
                System.out.println(returnee + " Book was returned");
                break;
            }
        }
        if(!issuedbooks[i].equals(returnee))
            System.out.println("Sorry we can't find the book in issued section.");
    }
}

public class Online_Library_Store implements members {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        String s;
        Library obj = new Library();
        System.out.println("-:Welcome to LIBRARY:-");
        do {
            System.out.println("Select your choice:-");
            System.out.println("1.Add Additional Books \n 2.Need Books \n 3.Return Books");
            choice = sc.nextInt();
            switch (choice) {
                case 1 -> obj.addBooks();
                case 2 -> obj.issuedBooks();
                case 3 -> obj.returnables();
                default -> System.out.println("Selected Wrong Choice");
            }
            System.out.println("Do You Want to exit the Store[y|n]");
            s = sc.next();
        } while (!s.equals("y") && !s.equals("Y"));
    }
}
