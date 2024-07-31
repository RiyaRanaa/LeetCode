import java.util.Arrays;
class Solution {
    public int minHeightShelves(int[][] books, int shelfWidth) {
        int n = books.length;
        int[] dp = new int[n + 1];
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[0] = 0; 
        for (int i = 1; i <= n; i++) {
            int totalWidth = 0;
            int maxHeight = 0;
            for (int j = i; j > 0; j--) {
                totalWidth += books[j - 1][0]; // Add book width
                if (totalWidth > shelfWidth) {
                    break;
                }
                maxHeight = Math.max(maxHeight, books[j - 1][1]); // Update max height
                dp[i] = Math.min(dp[i], dp[j - 1] + maxHeight); // Update dp[i]
            }
        }
        return dp[n];
    }
}
