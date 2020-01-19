public class TicTacToe {
    private char turn = 'x';
    private char[][] board=new char[][]{
            {'-', '-', '-'},
            {'-', '-', '-'},
            {'-', '-', '-'}};

    /**
     * Method that returns the current player who's turn is it.
     *
     * @return
     */
    public char getTurn() {
        return turn;
    }

    /**
     * Method that determines who's turn it is
     * @param line
     * @param column
     */
    public void takeTurn(int line, int column) {
        board[line][column] = turn;
        if (turn == 'x') {
            turn = '0';
        } else {
            turn = 'x';
        }
    }

    public char[][] getBoard() {
        return board;
    }

}

