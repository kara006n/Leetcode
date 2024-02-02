class Solution {

    // private boolean isValidForRow(char[][] board, int number, int row) {
    //     for (int i = 0; i < 9; i++) {
    //         if (board[row][i] == (char) number + '0')
    //             return false;
    //     }
    //     return true;
    // }

    // private boolean isValidForCol(char[][] board, int number, int column) {
    //     for (int i = 0; i < 9; i++) {
    //         if (board[i][column] == (char) number + '0')
    //             return false;
    //     }
    //     return true;
    // }

    // private boolean isValidForBox(char[][] board, int number, int row, int column) {

    //     int br = row - row % 3;
    //     int bc = column - column % 3;
    //     for (int i = br; i < br + 3; i++) {
    //         for (int j = bc; j < bc + 3; j++) {
    //             if (board[i][j] == (char) number + '0')
    //                 return false;
    //         }
    //     }
    //     return true;
    // }

    private boolean isValidNumber(char[][] board, int number, int row, int column){

        for (int i = 0; i < 9; i++) {
            if (board[row][i] == (char) number + '0')
                return false;

            if (board[i][column] == (char) number + '0')
                return false;    
        }

        // for (int i = 0; i < 9; i++) {
        //     if (board[i][column] == (char) number + '0')
        //         return false;
        // }

        int br = row - row % 3;
        int bc = column - column % 3;
        for (int i = br; i < br + 3; i++) {
            for (int j = bc; j < bc + 3; j++) {
                if (board[i][j] == (char) number + '0')
                    return false;
            }
        }


        return true;
    }

    public boolean solveSudoku(char[][] board) {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (board[i][j] == '.') {
                    for (int k = 1; k <= 9; k++) {
                        if (isValidNumber(board, k, i, j)) {
                            board[i][j] = (char)(k+'0');
                            if (solveSudoku(board)) {
                                return true;
                            } else {
                                board[i][j] = '.';
                            }
                        }

                    }
                    return false;
                }
            }
        }
        return true;
    }
}