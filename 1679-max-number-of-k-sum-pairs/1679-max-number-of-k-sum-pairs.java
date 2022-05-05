class Solution {
    public int maxOperations(int[] nums, int k) {
        
        
        Map<Integer,Integer> map = new HashMap<>();
        for(int x : nums)
            map.put(x,map.getOrDefault(x,0)+1);
        
        
        
        int count = 0;
        for(int x : nums){
            // System.out.println(map);
            if(map.containsKey(k-x) && map.containsKey(x)){
                
                if(x == k-x && map.get(x) < 2)
                    continue;
                
                if(map.get(x) > 1)
                    map.put(x, map.get(x)-1);
                else
                    map.remove(x);
                
                if(map.get(k-x) > 1)
                    map.put(k-x, map.get(k-x)-1);
                else
                    map.remove(k-x);
                
                count++;
            }
        }
        
        
        
        return count;
    }
}