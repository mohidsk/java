package practice_sets;
import java.util.*;
 class Pc_Val{
    int pc , user , point ,sol;
    public Scanner sc = new Scanner(System.in);
   public Pc_Val(){
        Random r = new Random();
        pc = r.nextInt(100);
   }
   public void takeUserInput(){
       System.out.println("-: Guess the number Under 100 :-");
      int user = sc.nextInt();
      if(user>0 && user<50) this.user = user;
      else{this.user= 0;}
   }
   public void gameLogic(){sol = pc-user;}
   public void noOfGuesses(){
       for(int i = 1;i<=5;i++){
           if (pc == user) break;
           else if (sol>0 && sol<5) System.out.println("🥳you are too close to the number🥳");
           else if ((sol>=-10&&sol<=-5)||(sol>=5&&sol<=10)) System.out.println("-:You are little close:-");
           else if ((sol>=-20&&sol<-10)||(sol>10&&sol<=20)) System.out.println("-:You are close:-");
           else if ((sol>=-30&&sol<-20)||(sol>20&&sol<=30)) System.out.println("-:You are little far:-");
           else if ((sol>=-40&&sol<-30)||(sol>30&&sol<=40)) System.out.println("-:You are far:-");
           else if ((sol>=-50&&sol<-40)||(sol>40&&sol<=50)) System.out.println("-:You are too far to the number:-");
           else System.out.println("😨You are Guessing Out of Range😨");
           System.out.println("-:Guess Again:-");
           user = sc.nextInt();
           gameLogic();
       }
       if(pc == user) point++;
       else {
                System.out.println("GAME OVER");
                System.out.println("😑LOSE😑");
       }
   }

   public void resultsOfTheGame() {
       if (point>0) {
           System.out.println("---------------------------------------");
           System.out.println("|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|");
           System.out.println("---------------------------------------");
           System.out.println("|✌✌|\t\t    🥳WON🥳  \t\t|✌✌|");
           System.out.println("---------------------------------------");
           System.out.println("| Original Number     : " + pc+"\t\t\t  |");
           System.out.println("---------------------------------------");
           System.out.println("| Your Number         : " + user+"\t\t\t  |");
           System.out.println("---------------------------------------");
           System.out.println("|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|");
           System.out.println("---------------------------------------");
       }
   }
}
public class Guss_Number_Game {
   static Pc_Val g = new Pc_Val();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ag;
        System.out.println("🤔🤔🤔GUESSING GAME🤔🤔🤔");
        do {
            g.takeUserInput();
            g.gameLogic();
            g.noOfGuesses();
            g.resultsOfTheGame();
            System.out.println("----------------------------------------");
            System.out.println("|-|-|-|😊Do you want play again😊|-|-|-|");
            System.out.println("----------------------------------------");
            ag = sc.nextLine();
        }while(ag.equals("YES")||ag.equals("yes")||ag.equals("Yes"));
    }
}
