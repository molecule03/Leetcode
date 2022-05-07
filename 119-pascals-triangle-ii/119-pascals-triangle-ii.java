class Solution {
    public List<Integer> getRow(int rowIndex) {
        
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> cur, pre = null;
        
        for(int i=0; i<=rowIndex; i++){
            cur = new ArrayList<>();
            // pre = new ArrayList<>();
            for(int j=0; j<=i; j++){
                if(j==0 || j==i)
                    cur.add(1);
                else
                    cur.add(pre.get(j-1) + pre.get(j));
            }
            pre = cur;
            ans.add(cur);
            // System.out.println(cur);
        }
        
        return ans.get(rowIndex);
    }
}