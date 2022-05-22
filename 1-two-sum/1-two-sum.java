class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        Map <Integer,Integer> nmap = new HashMap<>();        
        for(int i=0; i<nums.length; i++){
            
            int first_sum = target - nums[i];
            if(nmap.containsKey(first_sum) )
               return new int[]{nmap.get(first_sum),i};
               
               nmap.put(nums[i],i);
        }
        return new int[]{0,0};
    }
}