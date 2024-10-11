class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int maximam=0;
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                count++;
                maximam=Math.max(maximam,count);
            }
            else{
                count=0;
            }
        }
        return maximam;
    }
}