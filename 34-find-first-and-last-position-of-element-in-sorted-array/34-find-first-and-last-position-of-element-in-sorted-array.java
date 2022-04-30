class Solution {
    public int[] searchRange(int[] nums, int target) {
        
        int left = 0;
        int right = nums.length-1;
        
        int res[] = new int[2];
        Arrays.fill(res,-1);
        
        while(left <= right){
            
            if(nums[left] == target && nums[right] == target){
                res[0] = left;
                res[1] = right;
                break;
            }
            else if(nums[left] == target && nums[right] != target){
                res[0] = left;
                right--;
                continue;
            }
            else if(nums[left] != target && nums[right] == target){
                res[1] = right;
                left++;
                continue;
            }
            
            left++;
            right--;
        }
        
        return res;
    }
}