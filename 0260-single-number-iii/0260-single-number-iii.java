class Solution {
    public int[] singleNumber(int[] nums) {
        long xor=0;
        for (int i : nums) {
            xor = xor ^ i;
        }
        long rightmost = xor & -xor; 
        int b1=0,b2=0;
        for(int i=0;i<nums.length;i++){
            if((nums[i] & rightmost) !=0){
                b1=b1^nums[i];
            }
             else{
                b2=b2^nums[i];
             }
        }
        return new int[] {b1, b2};
    }
}