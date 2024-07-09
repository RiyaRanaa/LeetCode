class Solution {
    public double averageWaitingTime(int[][] customers) {
        var n = customers.length;
        var time = 0;
        var sum = 0L;
        for (var i=0; i<n; i++) {
            time = Math.max(time, customers[i][0]) + customers[i][1];
            sum += time - customers[i][0];
        }
        return (double) sum / n;
    }
}