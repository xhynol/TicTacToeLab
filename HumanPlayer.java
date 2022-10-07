import java.util.Scanner;
/** class HumanPlayer manages the moves for making a move */

public class HumanPlayer
{
  private TicTacToe t;
  public HumanPlayer(TicTacToe t)
  {
    this.t = t;
  }
  /**
   * makeMove reads in two integers using Scanner and places either an 'X'
   * or a 'Y' onto the board.  If the spot is not open, it makes
   * the player try again until he/she enters a correct move
   */
  public void makeMove()
  {int a, b,i =0;
    while(i<9){
      System.out.println(t.getPlayer());
      do {
          Scanner w = new Scanner(System.in);
          do{
              do{
            System.out.println("where to put "+ t.getPlayer());
            a = w.nextInt();
            b = w.nextInt();}
            // make sure spot is not already filled
            while(!(t.getBoard().get(a,b).equals("-")));
          }
          // makes sure a and b are not too big or too small
          while(a>2 || b>2 || a<0 || b<0);
          //makes sure the spot is empty
          if(t.getBoard().get(a,b).equals("-"))
          {
            t.getBoard().set(a,b,t.getPlayer());
            i++;
            System.out.println(t);
            if(t.winner().equals(t.getPlayer()))
            {
              System.out.println(t.getPlayer()+ " wins");
            
              return;
            }
          t.switchPlayer();}
          
      }
      //if spot is not empty, it will ask for 2 integers
      while((t.getBoard().get(a,b).equals("-")));
    }
    //if there are no moves left
      System.out.println("It is a tie");
  }
}
  

    
  
