public class LaunchGame {
    public static void main(String[] args) {
         TicTacToe  t = new TicTacToe();
         t.displayBoard();



        System.out.println(t.checkDiagonalWin());
        System.out.println(t.checkColumnWin());
        System.out.println(t.checkRowWin());
    }
}
