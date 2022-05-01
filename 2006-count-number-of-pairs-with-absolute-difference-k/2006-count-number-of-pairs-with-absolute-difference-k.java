class Solution {
    public int countKDifference(int[] nums, int k) {
        
        Map<Integer,Integer> map = new HashMap<>();
        for(int num : nums)
            map.put(num, map.getOrDefault(num,0)+1);
        
        // System.out.println(map);
        int count = 0;
        for(int x : map.keySet()){
            if(map.containsKey(x+k))
                count += map.get(x+k)*map.get(x);
        }
        
        return count;
    }
}