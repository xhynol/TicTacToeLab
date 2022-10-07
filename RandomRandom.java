import java.util.Scanner;
/** class HumanPlayer manages the moves for making a move */

public class RandomRandom
{
  private TicTacToe t;
  public RandomRandom(TicTacToe t)
  {
    this.t = t;
  }
  /**
   * makeMove reads in two integers using Scanner and places either an 'X'
   * or a 'Y' onto the board.  If the spot is not open, it makes
   * the player try again until he/she enters a correct move
   */
  public void makeMove()
  {int c, d,i =0;
    while(i<9){
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
            t.getBoard().set(c,d,t.getPlayer());
            i++;
            System.out.println(t);
            //if computer gets a three in a row it wins
            if(t.winner().equals(t.getPlayer())){
              System.out.println(t.getPlayer()+ " wins");
              
              return;
            }
            //switches computer
            t.switchPlayer();
        }
        
      }
      while((t.getBoard().get(c,d).equals("-")));

  }
  //out of moves
  System.out.println("It is a tie");}
}