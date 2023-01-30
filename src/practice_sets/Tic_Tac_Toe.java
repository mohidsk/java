package practice_sets;
import java.util.Scanner;
import java.util.Random;
class Game{
    String [][]box = new String[3][3];
    Scanner sc = new Scanner(System.in);
    char choice_symbol;
    public void instructions(){
        System.out.println("\t\t\t\t-:Instructions:-\n1. For First block\n2. For Second block\n3.For Third block\n4. For Fourth block" +
                " 5. For Fifth block\n6. For Sixth block\n7. For Seventh block\n8. For Eight block\n9. For Ninth Block");
        System.out.println("-------------\n| 1 | 2 | 3 |\n-------------\n"+
                "| 4 | 5 | 6 |\n-------------\n| 7 | 8 | 9 |\n-------------\n");
        System.out.println("Enter the Symbol you want [O|X]:");
    }
    public void user(){
        System.out.println(":Enter your choice:");
       int user = sc.nextInt();
//       switch case for take user input for game
        if(choice_symbol== 'x'||choice_symbol=='x'){
        switch (user){
            case 1 -> box[0][0] = String.valueOf('X');
            case 2 -> box[0][1] = String.valueOf('X');
            case 3 -> box[0][2] = String.valueOf('X');
            case 4 -> box[1][0] = String.valueOf('x');
            case 5 -> box[1][1] = String.valueOf('x');
            case 6 -> box[1][2] = String.valueOf('x');
            case 7 -> box[2][0] = String.valueOf('x');
            case 8 -> box[2][1] = String.valueOf('x');
            case 9 -> box[2][2] = String.valueOf('x');
            default -> System.out.println("In valid");
        }
        else{
                switch (user){
                   if(box[] )
            }

            }
    }
    public void pC(){
        Random pc = new Random();
        //program for pc random value
       int val = pc.nextInt(1,6);
       int []pc_val = new int[6];
//       Logic to play game for pc
        do {
            if(choice_symbol=='X'||choice_symbol=='x')
            switch (val){
                case 1 -> box[0][0] = String.valueOf('O');
                case 2 -> box[0][1] = String.valueOf('O');
                case 3 -> box[0][2] = String.valueOf('O');
                case 4 -> box[1][0] = String.valueOf('O');
                case 5 -> box[1][1] = String.valueOf('O');
                case 6 -> box[1][2] = String.valueOf('O');
                case 7 -> box[2][0] = String.valueOf('O');
                case 8 -> box[2][1] = String.valueOf('O');
                case 9 -> box[2][2] = String.valueOf('O');
                default -> System.out.println("In valid");
            }
            else {
                switch (val){
                    case 1 -> box[0][0] = String.valueOf('X');
                    case 2 -> box[0][1] = String.valueOf('X');
                    case 3 -> box[0][2] = String.valueOf('X');
                    case 4 -> box[1][0] = String.valueOf('X');
                    case 5 -> box[1][1] = String.valueOf('X');
                    case 6 -> box[1][2] = String.valueOf('X');
                    case 7 -> box[2][0] = String.valueOf('X');
                    case 8 -> box[2][1] = String.valueOf('X');
                    case 9 -> box[2][2] = String.valueOf('X');
                    default -> System.out.println("In valid");
                }
            }

            }

        }

    }
    public void show(){
        System.out.println("-------------\n| 1 | 2 | 3 |\n-------------\n"+
                "| 4 | 5 | 6 |\n-------------\n| 7 | 8 | 9 |\n-------------\n");

    }


}

public class Tic_Tac_Toe {
    public static void main(String[] args) {
        Game g = new Game();
       g.instructions();
        g.user();
        g.pC();
        g.show();

    }
}
