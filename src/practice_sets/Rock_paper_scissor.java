package practice_sets;
import java.util.Random;
import java.util.Scanner;
public class Rock_paper_scissor {
    public static void main(String[] args) {
        System.out.println("\"ROCK PAPER SCISSOR\"");
        System.out.println("0.Rock \n 1.Paper \n 2.Scissor");
        System.out.println("Enter Rounds:-");
        Scanner user = new Scanner(System.in);
        int rounds = user.nextInt();
        int i = 0;
        int p = 0;
        int u = 0;
        String d;
        do {
            while (i < rounds) {
                System.out.println("Round  " + (1 + i));
                Random rand = new Random();
                int pc = rand.nextInt(3);
                System.out.println("Your turn :-");
                int you = user.nextInt();
                switch (you) {
                    case 0 -> System.out.println("you:  Rock");
                    case 1 -> System.out.println("you:  Paper");
                    case 2 -> System.out.println("you:  Scissor");
                }
                switch (pc) {
                    case 0 -> System.out.println("pc:   Rock");
                    case 1 -> System.out.println("pc:   Paper");
                    case 2 -> System.out.println("pc:   Scissor");
                }
                if (pc == you) {
                    System.out.println("Both got 1 - 1 points🥳");
                    p = p + 1;
                    u = u + 1;
                } else if (pc == 0 && you == 1) {
                    u = u + 1;
                } else if (pc == 1 && you == 0) {
                    p = p + 1;
                } else if (pc == 0 && you == 2) {
                    p = p + 1;
                } else if (pc == 2 && you == 0) {
                    u = u + 1;
                } else if (pc == 1 && you == 2) {
                    u = u + 1;
                } else if (pc == 2 && you == 1) {
                    p = p + 1;
                }
                i++;
            }
                System.out.println("***POINTS***");
                System.out.println("PC: " + p);
                System.out.println("YOU: " + u);
                if (p > u) {
                    System.out.println("PC Win🥳");
                } else if (u > p) {
                    System.out.println("YOU Win🥳");
                } else {
                    i = 0;
                    System.out.println("Both got Tie");
                    System.out.println("You have a chance to Re-match!");
                    System.out.println("Yes OR No");
                }
                d = user.next();
        } while ( d.equals("yes") || d.equals("Yes") || d.equals("YES"));
        user.close();

    }
}
