public class TicTacToe {
    private char turn = 'x';
    private char[][] board = new char[][]{
            {'-', '-', '-'},
            {'-', '-', '-'},
            {'-', '-', '-'}};

    /**
     * Method returns the current player that has to take the next run.
     * @return
     */
    public char getTurn() {
        return turn;
    }

    public void makeMove(int line, int column) {
        board[line][column] = turn;

        if(turn =='x') {
            turn = '0';
        } else {
            turn = 'x';
        }
    }

    public char[][] getBoard() {
        return board;
    }

    /**
     * Method return 0 if game is not over
     * Returns 1 if X won
     * Return 2 if 0 won
     * Return -1 if has no more possible moves
     * @return
     */
    public int isOver() {
        for (int i = 0; i <board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if(board[i][j] == '-') {
                    return 0;
                }
            }
        }
        return -1;
    }
}
