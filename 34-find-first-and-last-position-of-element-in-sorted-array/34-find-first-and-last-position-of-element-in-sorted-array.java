class Solution { 
    
    public int[] searchRange(int[] nums, int target) {
        if(nums.length == 1 && nums[0] == target) return new int[]{0,0};
        
        int res[] = new int[2];
        
        res[0] = findleft(nums,target);
        res[1] = findright(nums,target);
        
        return res;
    }
    
    private int findleft(int[] nums, int target){
        
        int idx = -1;
        int left = 0;
        int right = nums.length-1;
        
        while(left<=right){
            int mid = left+(right-left);
            
            if(nums[mid] >= target)
                right = mid-1;
            else 
                left = mid+1;
            
            
            if(nums[mid] == target)  idx = mid;
        }
        
        return idx;
    }
    
    private int findright(int[] nums, int target){
        
        int idx = -1;
        int left = 0;
        int right = nums.length-1;
        
        while(left<=right){
            int mid = left+(right-left);
            
            if(nums[mid] <= target)
                left = mid+1;
            else
                right = mid-1;
            
            if(nums[mid] == target) idx = mid;
        }
        return idx;
    }
    

}