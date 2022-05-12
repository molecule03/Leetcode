class Solution {
    public int[][] merge(int[][] intervals) {
        
        List<int[]> res = new ArrayList<>();
        if(intervals.length == 0) return res.toArray(new int[0][]);
        
        Arrays.sort(intervals, (a, b)-> a[0]-b[0]);
        
        int fir = intervals[0][0];
        int last = intervals[0][1];
        
        for(int[] i : intervals){
            if(last >= i[0]){
                last = Math.max(last,i[1]);
            }else{
                res.add(new int[]{fir,last});
                fir = i[0];
                last = i[1];
            }
        }
        
        res.add(new int[]{fir,last});
        
        return res.toArray(new int[0][]);
        
        
    }
}