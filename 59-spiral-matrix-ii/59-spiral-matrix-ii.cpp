class Solution {
public:
    vector<vector<int>> generateMatrix(int n) {
        vector<vector<int>> res (n, vector<int>(n)) ;
        
        int rowB = 0;
        int rowE = n-1;
        int colB = 0;
        int colE = n-1;

        int val = 1;
        while(rowB <= rowE && colB <= colE){ 
            
            for(int i=colB; i<=colE; i++){
                res[rowB][i] = val++;
            }
            rowB++;
            
            for(int i=rowB; i<=rowE; i++){
                res[i][colE] = val++;
            }
            colE--;
            
            for(int i=colE; i>=colB; i--){
                res[rowE][i] = val++;
            }
            rowE--;
            
            for(int i=rowE; i>=rowB; i--){
                res[i][colB] = val++;
            }
            colB++;
        } 
        
        return res;
    }
};