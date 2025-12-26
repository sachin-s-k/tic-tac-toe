import java.util.Scanner;

public class HumanPlayer {
    String name;
char mark;


    void makeMove(int row, int col, char mark) {
 Scanner scanner=new Scanner(System.in );
 System.out.println("Enter your row and colum number:");
 int row= scanner.nextInt();
         int col=scanner.nextInt();


    }
public boolean isValidMove(int row, int col) {
        if(row >=0&&col>=0&&row<=2&&col<=2) {
            if (TicTacToe.board[row][col] == ' ') {
                return true;
            }

        }
        return false;
};
HumanPlayer(String name, char mark){
    this.name=name;
    this.mark=mark;

}


}
