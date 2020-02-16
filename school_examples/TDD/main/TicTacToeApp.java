import java.util.Scanner;

public class TicTacToeApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TicTacToe game = new TicTacToe();
        while(game.isOver() == 0) {
            int line = sc.nextInt();
            int col = sc.nextInt();

            game.makeMove(line, col);
        }
    }
}
