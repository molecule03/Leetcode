class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        int i=0 ,j = 0; 
        int maxSub = 0;  
        
        Set<Character> set = new HashSet<>();
        while(j < s.length()){
            if(!set.contains(s.charAt(j))){
                set.add(s.charAt(j++));
                maxSub = Math.max(maxSub,set.size());
            }
            else{
                set.remove(s.charAt(i++));
            }
        }
        return maxSub;
    }
}