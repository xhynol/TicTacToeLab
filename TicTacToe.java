/**
 * A class for managing all the rules of TicTacToe and keeping track of the
 * current player, who, the number of 'moves,' who is the winner and clearing
 * the board when it's time to switch players.
 */
public class TicTacToe {
  /**
   * a 3x3 board for tic tac toe Note: it's a board of type char Something new for
   * us.
   */
  private Board board;

  /**
   * curPlayer can be the character "X" or "O" starts as an "X" and gets swapped
   */
  private String player = "X";

  /**
   * This Constructor is more for testing.
   * 
   * @param b The Board object keeps track of the "X" and "O" placement and the
   *          dimensions of the board
   */
  public TicTacToe(Board b) {
    board = b;

  }

  /**
   * Default Constructor sets all spots to "-";
   */
  public TicTacToe() {
    Board c = new Board(3,3);
    board = c;
    for(int i = 0; i<3; i++ ){
      for(int a = 0;a<3;a++){
        board.set(i,a,"-");
      }
    }
  }

  /**
   * Resets the board to start over when it's time start a new game
   */
  public void clearBoard() {
    for(int i = 0; i<3; i++ ){
      for(int a = 0;a<3;a++){
        board.set(i,a,"-");
      }
    }
  }

  /**
   * Check if each item in the rows, columns and diagonals to to see if they equal
   * the current player
   */
  public String winner() 
  {
    // checks every row for three in a row
     for(int i = 0; i< 3;i++){
       String b = "";
       for(int a = 0;a<3;a++){
         b+= board.get(i,a);
       }
       if(b.equals("OOO")){
         return "O";
       }
       if(b.equals("XXX")){
         return "X";
       }
     }
     // checks every columns
     for(int i = 0; i< 3;i++){
       String b = "";
       for(int a = 0;a<3;a++){
         b+= board.get(a,i);
       }if(b.equals("OOO")){
         return "O";
       }
       if(b.equals("XXX")){
         return "X";
       }
    }
    //checks the diagonals
    String a = board.get(0,0) +board.get(1,1) + board.get(2,2);
    if(a.equals("OOO")){
         return "O";
       }
       if(a.equals("XXX")){
         return "X";
       }
    a = board.get(0,2) +board.get(1,1) + board.get(2,0);
    if(a.equals("OOO")){
         return "O";
       }
       if(a.equals("XXX")){
         return "X";
       }
    return "Y";
  }

  /**
   * gets the current board and all it's data
   */
  public Board getBoard() 
  {
    return board;
  }

  /**
   * get the current player - can be either "X" or "Y"
   */
  public String getPlayer() 
  {
    return player;
  }

  /**
   * Swaps between "X" and "Y"'
   */
  public void switchPlayer() {
    if(player.equals("X") ){
      player = "O";
    }
    else{player = "X";}
  }

  public String toString() 
  {
      return board.toString();
  }
}
