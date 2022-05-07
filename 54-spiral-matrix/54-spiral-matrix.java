class Solution {
    boolean[][] vis; 
    
    public List<Integer> spiralOrder(int[][] res) {
        
        vis = new boolean[res.length][res[0].length];
        List<Integer> list = new ArrayList<>();
        
        int rowB = 0;
        int rowE = res.length-1;
        int colB = 0;
        int colE = res[0].length-1;

        while(rowB <= rowE && colB <= colE){ 
            
// for right traverse
            for(int i=colB; i<=colE; i++){
                if(!isVisited(rowB,i)){
                list.add(res[rowB][i]); 
                vis[rowB][i] = true;
                }
            }
            rowB++;
            
// for down traverse   
            for(int i=rowB; i<=rowE; i++){
                  if(!isVisited(i,colE)){
                list.add(res[i][colE]); 
                vis[i][colE] = true;
                  }
            }
            colE--;
            
// for left traverse
            for(int i=colE; i>=colB; i--){
                  if(!isVisited(rowE,i)){
                list.add(res[rowE][i]);
                vis[rowE][i] = true;
                  }
            }
            rowE--;
            
// for up traverse\
            for(int i=rowE; i>=rowB; i--){
                  if(!isVisited(i,colB)){
                list.add(res[i][colB]);
                vis[i][colB] = true;
                  }
            }
            colB++;
        } 
        
        return list;
    }
    
    private boolean isVisited(int x, int y){
        return vis[x][y];
    }
}