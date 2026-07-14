class Solution {

    public boolean checkRows(char[][] board){
        for(int i=0; i<9; i++){
            boolean[] nums = new boolean[9];
            for(int j=0; j<9; j++){
                if(board[i][j]!='.'){
                    int num = board[i][j] - '0';
                    if(nums[num-1]) return false;
                    nums[num-1] = true;
                }
            }
        }
        return true;
    }

    public boolean checkCols(char[][] board){
        for(int j=0; j<9; j++){
            boolean[] nums = new boolean[9];
            for(int i=0; i<9; i++){
                if(board[i][j]!='.'){
                    int num = board[i][j] - '0';
                    if(nums[num-1]) return false;
                    nums[num-1] = true;
                }
            }
        }
        return true;
    }

    public boolean checkSubs(char[][] board){
        for(int i=0; i<9; i+=3){
            for(int j=0; j<9; j+=3){
                boolean[] nums = new boolean[9];
                for(int k=0; k<3; k++){
                    for(int l=0; l<3; l++){
                        int r = i+k;
                        int c = j+l;
                        if(board[r][c]!='.'){
                            int num = board[r][c]-'0';
                            if(nums[num-1]) return false;
                            nums[num-1] = true;
                        }
                    }
                }
            }
        }
        return true;
    }
    public boolean isValidSudoku(char[][] board) {
        return checkRows(board) && checkCols(board) && checkSubs(board);
    }
}
