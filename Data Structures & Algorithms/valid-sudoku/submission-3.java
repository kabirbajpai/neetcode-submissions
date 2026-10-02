class Solution {
    public boolean isValidSudoku(char[][] board) {
        for(int i=0;i<board.length;i++){
            int count = 0 ;
            HashSet<Character> set = new HashSet<>();
            for(int j=0;j<board[i].length;j++){
                if(board[i][j]!='.'){
                    count++;
                    set.add(board[i][j]);
                }
            }

            if(set.size()!=count){
                return false ;
            }
        }

        for(int j=0;j<board[0].length;j++){
            int count = 0 ;
            HashSet<Character> set = new HashSet<>();
            for(int i=0;i<board.length;i++){
                if(board[i][j]!='.'){
                    count++;
                    set.add(board[i][j]);
                }
            }

            if(set.size()!=count){
                return false ;
            }

        }

        for(int row=0;row<board.length;row+=3){
            for(int col=0;col<board[0].length;col+=3){
                int count = 0 ;
                HashSet<Character> set = new HashSet<>();
                for(int i=row ; i<row+3;i++){
                    for(int j=col;j<col+3;j++){
                        if(board[i][j]!='.'){
                            count++;
                            set.add(board[i][j]);
                        }
                    }
                }
                if(set.size()!=count){
                return false ;

            }

            }

            
        }



        return true ;
        
    }
}
