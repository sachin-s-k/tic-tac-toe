import java.util.Scanner;

public class HumanPlayer extends Player {



    void makeMove() {
 Scanner scanner=new Scanner(System.in );
        int rows;
        int cols;
do{
    System.out.println("Enter your row and colum number:");
   rows= scanner.nextInt();
   cols=scanner.nextInt();


}while(!isValidMove(rows, cols));

TicTacToe.placeMark(rows,cols,mark);

    }

HumanPlayer(String name, char mark){
    this.name=name;
    this.mark=mark;

}


}
