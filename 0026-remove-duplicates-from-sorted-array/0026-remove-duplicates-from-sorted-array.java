class Solution {
    public int removeDuplicates(int[] nums) {
        int len=nums.length;
        int l=1;
        if(len==0){
            return 0;
        }
        for(int r=1;r<len;r++){
            if(nums[r]!=nums[r-1]){
                nums[l]=nums[r];
                l++;
            }
        }
        return l;
    }
}