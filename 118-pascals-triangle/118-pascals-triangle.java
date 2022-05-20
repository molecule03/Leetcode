class Solution {
    public List<List<Integer>> generate(int numRows) {

    List<List<Integer>> result = new ArrayList<>();
    List<Integer> row = null;
    List<Integer> pre_row = null;
    
    for(int i=0; i<numRows; i++){
        row = new ArrayList<>();
        for(int j=0; j<=i; j++){
            if(j == 0 || j == i)
                row.add(1);
            else
                row.add(pre_row.get(j-1) + pre_row.get(j));
        }
        pre_row = row;
        result.add(row);
    }
    return result;
}
}