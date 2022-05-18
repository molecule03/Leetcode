class Solution {
public:
    int findUnsortedSubarray(vector<int>& nums) {
       int start=0, end=-1;
        int max=INT_MIN;
        int min=INT_MAX;
        
        
        for(int i=0; i<nums.size(); i++){
            if(nums[i]<max){
                end=i;
            }
            else{
                max = nums[i];
            }
        }
        
        
        for(int i=nums.size()-1; i>=0; i--){
            if(nums[i]>min){
                start=i;
            }
            else{
                min = nums[i];    
            }
        }
        
        cout<<start<<" "<<end;
        return end-start+1;
    }
};

