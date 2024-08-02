class Solution {
    public int minSwaps(int[] nums) {
        int ws=0;
        for(int n:nums){
                ws+=n;
        }
        int current_0=0;
        for(int i=0;i<ws;i++){
            if(nums[i]==0){
                current_0++;
            }
        }
        int min_0=current_0;
        int s=0;
        int e=ws-1;
        int n=nums.length;
        while(s<n){
            if(nums[s]==0){
                current_0--;
            }
            s++;
            e++;
            if(nums[e%n]==0){
                current_0++;
            }
            min_0=Math.min(min_0, current_0);
        }
        return min_0;
    }
}