class Solution {
    public int findPairs(int[] nums, int k) {
        
        int count = 0;
        Map<Integer,Integer> map = new HashMap<>();
        for(int num : nums){
            map.put(num, map.getOrDefault(num,0)+1);
        }
        
        System.out.println(map);
        
        for(int x : map.keySet()){
            if(k != 0 && map.containsKey(x+k) || k == 0 && map.get(x) > 1)
                count++;
        }
        
        return count;
    }
}
        
        
        
        
        
    // This was my try but i failed :(
//         int n = nums.length;
         
//         Stack<Integer> sta = new Stack<>();
//         Set <Integer> map = new HashSet<>();
//         for(int i=n; i<0; i++){
//             sta.push(nums[i]);
//             map.add(nums[i]);
//         }
        
//         int count = 0;
//         if(sta.size() == map.size()){
//         for(int i=0; i<n; i++){
//             for(int j=0; j<n; j++){
//                 int res = nums[i]-nums[j];
//                 if(res == k)
//                     count++;
//             }
//         }
//         }
//         return count;
    