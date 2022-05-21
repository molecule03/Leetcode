class Solution {
public:
    long long waysToBuyPensPencils(int total, int cost1, int cost2) {
          if(cost1 > total && cost2 > total) return 1;
        
        int high = 0;
        int low = 0;
        if(cost1>cost2){
            high = cost1;
            low = cost2;
        }
        else{
            high = cost2;
            low = cost1;
        }
        
        int i=0;
        long count = 0;
        while(i*high <= total){
            count +=  (long)((total-(i*high))/low)+1;
            i++;
        }
        
        return count;
    }
};