class Solution {
    public int[] twoSum(int[] nums, int target) {
        int s=0;
        int e= nums.length-1;
        int result[]=new int[2];
        while(s<e){
            int sum = nums[s]+nums[e];
            if(sum==target){
                result[0]=s + 1;
                result[1]=e +1;
                break;
            }
            else if(sum < target){
                s++;
            }
            else{
                e--;
            }
        }
        return result;
    }
}