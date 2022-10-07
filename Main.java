class Main {
 


  public static void main(String[] args)
  {
    TicTacToe a= new TicTacToe();
   System.out.println(a);
   //RandomRandom v = new RandomRandom(a);
   //RandomPlayer v = new RandomPlayer(a);
   HumanPlayer v = new HumanPlayer(a);
   v.makeMove();
   System.out.println("end");
  }
}