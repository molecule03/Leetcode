class Solution {
    public int findClosestNumber(int[] nums) {
        
        Arrays.sort(nums);
        if(nums[0]<0 && nums[nums.length-1]<0){
            return nums[nums.length-1];
        }
         // System.out.println(Arrays.toString(nums));
        
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
        
        // Arrays.sort(nums);
        // System.out.println(Arrays.toString(nums));
        return res;
    }
}