import java.util.Random;
import java.util.Scanner;

public class AiPlayer extends Player {





        void makeMove() {
            Scanner scanner=new Scanner(System.in );
            int rows;
            int cols;
            do{
            Random r= new Random();
            rows=r.nextInt(3);
            cols=r.nextInt(3);


            }while(!isValidMove(rows, cols));

            TicTacToe.placeMark(rows,cols,mark);

        }
        public boolean isValidMove(int row, int col) {
            if(row >=0&&col>=0&&row<=2&&col<=2) {
                if (TicTacToe.board[row][col] == ' ') {
                    return true;
                }

            }
            return false;
        };
        AiPlayer(String name, char mark){
            this.name=name;
            this.mark=mark;

        }




}
