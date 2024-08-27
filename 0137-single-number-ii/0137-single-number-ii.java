class Solution {
    public int singleNumber(int[] nums) {
        int ones=0, twos=0;
        for(int i=0;i<nums.length;i++){
            ones=(nums[i] ^ ones) & ~twos;
            twos=(nums[i] ^ twos) & ~ones;
        }
        return ones;
    }
}