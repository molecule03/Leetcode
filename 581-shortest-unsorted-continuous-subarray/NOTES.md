boolean r = false;
boolean l = false;
int start = -1;
int end = 0;
while(left <= right){
System.out.println(left+" "+right);
if(nums[left] >= min){
min = nums[left];
start = left;
left++;
}
else{
l = true;
// left--;
}
if(nums[right] <= max){
max = nums[right];
end = right;
right--;
}
else{
r = true;
// right++;
}
if(r && l)
return end - start +1;
}