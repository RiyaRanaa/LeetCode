public class Solution {
    public long maxPoints(int[][] points) {
        int m = points.length;
        int n = points[0].length;
        long[] dp = new long[n];
        long[] prev = new long[n];
        for (int j = 0; j < n; j++) {
            dp[j] = points[0][j];
        }
        for (int i = 1; i < m; i++) {
            System.arraycopy(dp, 0, prev, 0, n);
            long[] leftMax = new long[n];
            long[] rightMax = new long[n];
            leftMax[0] = prev[0];
            for (int j = 1; j < n; j++) {
                leftMax[j] = Math.max(leftMax[j - 1], prev[j] + j);
            }
            rightMax[n - 1] = prev[n - 1] - (n - 1);
            for (int j = n - 2; j >= 0; j--) {
                rightMax[j] = Math.max(rightMax[j + 1], prev[j] - j);
            }
            for (int j = 0; j < n; j++) {
                dp[j] = Math.max(leftMax[j] - j, rightMax[j] + j) + points[i][j];
            }
        }
        long maxPoints = 0;
        for (int j = 0; j < n; j++) {
            maxPoints = Math.max(maxPoints, dp[j]);
        }

        return maxPoints;
    }
}
