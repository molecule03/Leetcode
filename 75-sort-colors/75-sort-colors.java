class Solution {
    public void sortColors(int[] nums) {
        
        int pre = 0;
        int left = 0;
        int right = nums.length-1;
        
        while(left<=right){
            switch(nums[left]){
            
                case 0:{
                    swap(pre, left, nums);
                    pre++;
                    left++;
                    break;
                }   
                case 1:{
                    left++;
                    break;
                }
                case 2:{
                    swap(left, right, nums);
                    // left++;
                    right--;
                    break;
                }
            }
        }
        
    }
    
    private void swap(int i, int j, int nums[]){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}