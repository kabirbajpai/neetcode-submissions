

class Solution {
    public boolean isValidSudoku(char[][] board) {

        // Check rows
        for (int i = 0; i < 9; i++) {

            int count = 0;
            HashSet<Character> set = new HashSet<>();

            for (int j = 0; j < 9; j++) {

                if (board[i][j] != '.') {
                    count++;
                    set.add(board[i][j]);
                }
            }

            if (count != set.size()) {
                return false;
            }
        }

        // Check columns
        for (int j = 0; j < 9; j++) {

            int count = 0;
            HashSet<Character> set = new HashSet<>();

            for (int i = 0; i < 9; i++) {

                if (board[i][j] != '.') {
                    count++;
                    set.add(board[i][j]);
                }
            }

            if (count != set.size()) {
                return false;
            }
        }

        // Check 3 x 3 grids
        for (int row = 0; row < 9; row += 3) {

            for (int col = 0; col < 9; col += 3) {

                int count = 0;
                HashSet<Character> set = new HashSet<>();

                for (int i = row; i < row + 3; i++) {

                    for (int j = col; j < col + 3; j++) {

                        if (board[i][j] != '.') {
                            count++;
                            set.add(board[i][j]);
                        }
                    }
                }

                if (count != set.size()) {
                    return false;
                }
            }
        }

        return true;
    }
}