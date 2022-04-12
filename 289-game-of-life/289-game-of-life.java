class Solution {
    public void gameOfLife(int[][] board) {
        
// This is to travers in all 8 directions...         
        int[] dx = {0,1,1,1,0,-1,-1,-1};
        int[] dy = {1,1,0,-1,-1,-1,0,1};
        
       
        for(int col=0; col<board.length; col++){
            for(int row=0; row<board[0].length; row++){
                int curLength = 0;
                
                //this for loop is to check all 8 directions
                for(int i=0; i<8; i++){
                    
                    int curX = col+dx[i];
                    int curY = row+dy[i];
                    
                    if(isValidNeigh(curX,curY, board) && Math.abs(board[curX][curY]) == 1)
                        curLength++;
                }
                
                if(board[col][row] == 1 && (curLength<2 || 3<curLength))
                    board[col][row] = -1;
                else if(board[col][row] == 0 && curLength == 3)
                    board[col][row] = 2;
            }
        }
        
        for(int col=0; col<board.length; col++){
            for(int row=0; row<board[0].length; row++){
                if(board[col][row] >= 1)
                    board[col][row] = 1;
                else 
                    board[col][row] = 0;
            }
        }
        
    }
    
// This Method is to simply check index.outOfBound..   we directly write this is main method but to avoid mess we are writng like this..
    private boolean isValidNeigh(int x, int y, int[][] board){
        if(x < 0 || x >= board.length || y < 0 || y >= board[0].length)
            return false;
        
        return true;
    }
}