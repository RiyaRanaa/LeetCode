class Solution {
    public int removeDuplicates(int[] nums) {
        // int len=nums.length;
        // int l=1;
        // if(len==0){
        //     return 0;
        // }
        // for(int r=1;r<len;r++){
        //     if(nums[r]!=nums[r-1]){
        //         nums[l]=nums[r];
        //         l++;
        //     }
        // }
        // return l;


        // Take a variable i as 0
        int i=0;
        //  Use a for loop by using a variable ‘j’ from 1 to length of the array.
        for(int j=1;j<nums.length;j++){
            // If arr[j] != arr[i], increase ‘i’ and
            if(nums[i]!=nums[j]){
                i++;
                //  update arr[i] == arr[j].
                nums[i]=nums[j];
            }
        }
        // After completion of the loop return i+1, i.e size of the array of unique elements.
        return i+1;
    }
}