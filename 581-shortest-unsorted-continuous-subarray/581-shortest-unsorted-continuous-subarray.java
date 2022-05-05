class Solution {
    public int findUnsortedSubarray(int[] nums) {
        
        
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        
        int start = -1;
        for(int i=0; i<nums.length; i++){
            if(nums[i] < max){
                start = i;
            }
            else{
                max = nums[i];
            }
        }
         
        
        int end = 0;
        for(int i=nums.length-1; i>=0; i--){
            if(nums[i] > min){
                end = i;
            }
            else{
                min = nums[i];
            }
        }
        
        return start-end+1;
    }
}