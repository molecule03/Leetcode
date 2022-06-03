class Solution {
    public void moveZeroes(int[] nums) {
        
        int idx = 0;
        for(int val : nums){
            if(val != 0){
                nums[idx++] = val;
            }
        }
        
        while(idx < nums.length){
            nums[idx++] = 0;
        }
    }
}


//         int i;
//         for(i = 0; i<nums.length; i++){
//             if(nums[i] == 0) break;
//         }
        
//         for(int j=i+1; j<nums.length; j++){
//             if(nums[i] == 0 &&  nums[i] != nums[j]){
//                 swap(i, j, nums);
//                 i++;
//             }
//         }