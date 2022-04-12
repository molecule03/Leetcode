class Solution {
public: void gameOfLife(vector<vector<int>>& board) {
       
    
          vector<int> dx = {0,1,1,1,0,-1,-1,-1};
        vector<int> dy = {1,1,0,-1,-1,-1,0,1};
        
       
        for(int c=0; c<board.size(); c++){
            for(int r=0; r<board[0].size(); r++){
                int curL = 0;
                   // System.out.println(c+" "+r);
                for(int i=0; i<8; i++){
                    
                    int curX = c+dx[i];
                    int curY = r+dy[i];
                    
                    if(isValidNeigh(curX,curY, board) && abs(board[curX][curY]) == 1)
                        curL++;
                }
                
                if(board[c][r] == 1 && (curL<2 || 3<curL))
                    board[c][r] = -1;
                else if(board[c][r] == 0 && curL == 3)
                    board[c][r] = 2;
            }
        }
        
        for(int c=0; c<board.size(); c++){
            for(int r=0; r<board[0].size(); r++){
                if(board[c][r] >= 1)
                    board[c][r] = 1;
                else 
                    board[c][r] = 0;
            }
        }
        
    }
    
    private: bool isValidNeigh(int x, int y, vector<vector<int>>&board){
        if(x < 0 || x >= board.size() || y < 0 || y >= board[0].size())
            return false;
        
        return true;
    }
    
};