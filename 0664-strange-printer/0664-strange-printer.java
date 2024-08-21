class Solution {
    public int strangePrinter(String s) {
        int n=s.length();
        int[][]dp=new int[n][n];
        for(int i=n-1;i>=0;i--){
            dp[i][i]=1;//base case - single character
            for(int j=i+1;j<n;j++){
                dp[i][j]=dp[i][j-1]+1;//worst case
                for(int k=i;k<j;k++){
                    if(s.charAt(k)==s.charAt(j)){
                        dp[i][j]=Math.min(dp[i][j], dp[i][k] + dp[k+1][j] -1);
                    }
                    else{
                        dp[i][j]=Math.min(dp[i][j], dp[i][k] + dp[k+1][j]);
                    }
                }
            }
        }
        return dp[0][n-1];
    }
}