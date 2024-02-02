class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet<Character>[] rows = new HashSet[9];
        HashSet<Character>[] column = new HashSet[9];
        HashSet<Character>[] boxes = new HashSet[9];

        for(int i=0; i<9; i++){
            rows[i] = new HashSet<Character>();
            column[i] = new HashSet<Character>();
            boxes[i] = new HashSet<Character>();
        }

        for(int r=0; r < 9; r++){
            for(int c = 0; c < 9; c++){
                if(board[r][c]=='.')
                continue;

                if(rows[r].contains(board[r][c])){
                    return false;
                }
                rows[r].add(board[r][c]);

                if(column[c].contains(board[r][c])){
                    return false;
                }
                column[c].add(board[r][c]);

                int index = (r/3)*3 + c/3;
                if(boxes[index].contains(board[r][c])){
                    return false;
                }
                boxes[index].add(board[r][c]);
            }
        }

        return true;

    }
}