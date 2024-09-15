public class Solution {
    public int longestSubarray(int[] nums) {
        int maxi = Integer.MIN_VALUE;
        int count = 0;
        int ans = 0;
        for (int num : nums) {
            if (num > maxi) {
                maxi = num;
                count = 1;
                ans = 1;
            } else if (num == maxi) {
                count++;
            } else {
                count = 0;
            }
            ans = Math.max(ans, count);
        }
        return ans;
    }
}