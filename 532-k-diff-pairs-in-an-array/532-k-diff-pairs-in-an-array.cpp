class Solution {
public:
    int findPairs(vector<int>& nums, int k) {
        
        unordered_map<int,int> m;
        for(int n: nums)
            m[n]++;
        
        // cout<<m<<endl;
        int cnt=0;
        for(auto p : m){
            
            if( (k!=0 && m.count(p.first+k)) ||
                (k==0 && p.second>1)           )
                cnt++;
        }
               return cnt;
    }
};