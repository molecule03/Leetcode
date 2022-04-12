class Solution {
    public void gameOfLife(int[][] board) {
        int[] dx = {0,1,1,1,0,-1,-1,-1};
        int[] dy = {1,1,0,-1,-1,-1,0,1};
        
       
        for(int c=0; c<board.length; c++){
            for(int r=0; r<board[0].length; r++){
                int curL = 0;
                   // System.out.println(c+" "+r);
                for(int i=0; i<8; i++){
                    
                    int curX = c+dx[i];
                    int curY = r+dy[i];
                    
                    if(isValidNeigh(curX,curY, board) && Math.abs(board[curX][curY]) == 1)
                        curL++;
                }
                // System.out.println(curL);
                
                if(board[c][r] == 1 && (curL<2 || 3<curL))
                    board[c][r] = -1;
                else if(board[c][r] == 0 && curL == 3)
                    board[c][r] = 2;
            }
        }
        
        for(int c=0; c<board.length; c++){
            for(int r=0; r<board[0].length; r++){
                if(board[c][r] >= 1)
                    board[c][r] = 1;
                else 
                    board[c][r] = 0;
            }
        }
        
    }
    
    private boolean isValidNeigh(int x, int y, int[][] board){
        if(x < 0 || x >= board.length || y < 0 || y >= board[0].length)
            return false;
        
        return true;
    }
}