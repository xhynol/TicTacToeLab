import java.util.Scanner;
import java.lang.*;

public class RandomPlayer
{
  private TicTacToe t;
  public RandomPlayer(TicTacToe t)
  {
    this.t = t;
  }
  
  public void makeMove()
  { 
    int a, b, c, d,i =0;
    //assigns X or O to player and computer
    String player = t.getPlayer();
    t.switchPlayer();
    String computer =t.getPlayer();

    while(i<9){
        System.out.println(player);
      do {
        Scanner w = new Scanner(System.in);
        do{
            do{
              System.out.println("where to put "+ player);
              a = w.nextInt();
              b = w.nextInt();}
              // make sure spot is not already filled
            while(!(t.getBoard().get(a,b).equals("-")));}
          // makes sure a and b are not too big or too small
        while(a>2 || b>2 || a<0 || b<0);
        if(t.getBoard().get(a,b).equals("-")){
            t.getBoard().set(a,b,player);
            i++;
            System.out.println(t);
            //if winner() finds a three in a row, it will say you win
            if(t.winner().equals(player)){
              System.out.println("you win");
            
              return;
            }
          }
        
        
      }
      //makes sure a b is not a empty spot
      while((t.getBoard().get(a,b).equals("-")));


      do {
        do{
          
            //computer choose two random numbers
            c = (int) (Math.random()*3);
            d =(int) (Math.random()*3);}
            // make sure spot is not already filled
          while(!(t.getBoard().get(c,d).equals("-")));
          //makes sure number is not too big/small
          if(t.getBoard().get(c,d).equals("-"))
          {
            t.getBoard().set(c,d,computer);
            i++;
            System.out.println(t);
            //if computer gets a three in a row it wins
            if(t.winner().equals(computer)){
              System.out.println("computer wins");
              
              return;
            }
        }
        
      }
      while((t.getBoard().get(c,d).equals("-")));

  }
  //out of moves
  System.out.println("It is a tie");}
}
    
 