public class LaunchGame {
    public static void main(String[] args) {
TicTacToe t = new TicTacToe();
       HumanPlayer p1=new HumanPlayer("sachin", 'X');
      AiPlayer p2=new AiPlayer("AI", 'O');

        Player cp;
         cp=p1;
      while(true){
          System.out.println(cp.name+"turn");
          cp.makeMove();
          TicTacToe.displayBoard();
          if(!TicTacToe.checkDraw()){
             System.out.println("checkDraw");
             break;
          }
          if(TicTacToe.checkColumnWin()||TicTacToe.checkRowWin()||TicTacToe.checkDiagonalWin()){
              TicTacToe.displayBoard();
              System.out.println(cp.name+" has won");
              break;
          }else{
              if(cp==p1){
                  cp=p2;

              }else{
                  cp=p1;
              }




          }
      }


    }
}
