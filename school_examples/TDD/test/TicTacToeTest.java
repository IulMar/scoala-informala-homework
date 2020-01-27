import org.junit.jupiter.api.Assertions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TicTacToeTest {

    @Test
    public void testFirstPlayerIsX() {
        TicTacToe game = new TicTacToe();

        char player = game.getTurn();

        Assert.assertEquals('x', player);
    }

    @Test
    public void testSecondPlayerIs0() {
        TicTacToe game = new TicTacToe();
        game.makeMove(1, 1);

        char player = game.getTurn();
        Assert.assertEquals('0', player);

        game.makeMove(0, 0);
        player = game.getTurn();
        Assert.assertEquals('x', player);
    }

    @Test
    public void testInitialBoardState() {
        char[][] initialBoardState = new char[][]{
                {'-', '-', '-'},
                {'-', '-', '-'},
                {'-', '-', '-'}};

        TicTacToe game = new TicTacToe();
        char[][] gameBoard = game.getBoard();
        Assertions.assertArrayEquals(initialBoardState, gameBoard);
//        Assert.assertArrayEquals(initialBoardState, gameBoard);
    }

    @Test
    public void testFirstMove() {
        TicTacToe game = new TicTacToe();
        game.makeMove(0,0);
        game.makeMove(0,1);

        Assert.assertEquals(game.getBoard()[0][0], 'x');
        Assert.assertEquals(game.getBoard()[0][1], '0');
    }

    @Test
    public void testBoardIsNotFull() {
        TicTacToe game = new TicTacToe();
        //facem mutari pana se umple tabla

        int over = game.isOver();

        Assert.assertEquals(0, over);

    }

    @Test
    public void testBoardIsFull() {
        TicTacToe game = new TicTacToe();
        //facem mutari pana se umple tabla

        game.makeMove(0,0);
        game.makeMove(0,1);
        game.makeMove(0,2);
        game.makeMove(1,0);
        game.makeMove(1,1);
        game.makeMove(1,2);
        game.makeMove(2,0);
        game.makeMove(2,1);
        game.makeMove(2,2);
        int over = game.isOver();

        Assert.assertEquals(-1, over);

    }
}
