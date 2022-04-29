class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        
        int left = 0;
        int right = arr.length-1;
        // int top = 0;
        while(left < right){
            
            if(arr[left] > arr[right])
                right--;
            else 
                left++;
            
            // System.out.println(left +" "+right);
        }
        
        return left;
    }
}