class Solution {
    public int findClosestNumber(int[] nums) {
        
        Arrays.sort(nums);
        
        int res = 0;
        int min = Integer.MAX_VALUE;
        for(int i=0; i<nums.length; i++){
            int cur = Math.abs(nums[i]);
            if(cur < min){
                min = cur;
                res = nums[i];
            }
            else if(cur == min){
                res = nums[i];
            }
        }
   
        return res;
    }
}