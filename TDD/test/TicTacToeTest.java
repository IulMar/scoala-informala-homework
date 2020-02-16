import org.junit.Assert;
import org.junit.Test;

public class TicTacToeTest {

    @Test
    public void testFirstPlayerIsX() {
        TicTacToe game = new TicTacToe();
        game.getTurn();
        char player = game.getTurn();
        Assert.assertEquals('x', player);

    }

    @Test
    public void testSecondPlayerIs0() {
        TicTacToe game = new TicTacToe();
        game.takeTurn(1, 1);
        char player = game.getTurn();
        Assert.assertEquals('0', player);

        game.takeTurn(0, 0);
        player = game.getTurn();
        Assert.assertEquals('x', player);

    }

    @Test
    public void testInitialBoardState() {
        char[][] initialBoarState = new char[][]{
                {'-', '-', '-'},
                {'-', '-', '-'},
                {'-', '-', '-'}};
        TicTacToe game = new TicTacToe();
        char[][] gameBoard = game.getBoard();
        Assert.assertArrayEquals(initialBoarState, gameBoard);
    }

    @Test
    public void testFirstMove(){
        TicTacToe game = new TicTacToe();
        game.takeTurn(0,0);
        game.takeTurn(0, 1);
        Assert.assertEquals(game.getBoard()[0][0], 'x');
        Assert.assertEquals(game.getBoard()[0][1], '0');
    }
}
