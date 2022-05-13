class Solution {
    public int[][] merge(int[][] intervals) {
        
        List<int[]> list = new ArrayList<>();
        
        Arrays.sort(intervals, (a,b)-> a[0]-b[0]);
        
        int first = intervals[0][0];
        int last = intervals[0][1];
        for(int[] curPair : intervals){
            if(last >= curPair[0]){
                last = Math.max(last,curPair[1]);
            }
            else{
                list.add(new int[]{first, last});
                first = curPair[0];
                last = curPair[1];
            }
        }
        list.add(new int[]{first, last});
        
        
        return list.toArray(new int[0][]);
    }
}