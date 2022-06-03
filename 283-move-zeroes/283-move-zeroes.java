class Solution {
    public void moveZeroes(int[] nums) {
        
        
        int i;
        for(i = 0; i<nums.length; i++){
            if(nums[i] == 0) break;
        }
        
        
        for(int j=i+1; j<nums.length; j++){
            if(nums[i] == 0 &&  nums[i] != nums[j]){
                swap(i, j, nums);
                i++;
            }
        }
    }
    
    private void swap(int i, int j, int[]nums){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}