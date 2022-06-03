class Solution {
    public int findDuplicate(int[] nums) {
        
        int n = nums.length;
        
        int fre[] = new int[n];
        for(int i : nums){
            if(fre[i] == 1)
                return i;
            
            fre[i] = 1;
        }
        
        return -1;
    }
}