class Solution {
    public int missingNumber(int[] arr) {
        int n=arr.length;
        int totalsum=(n*(n+1))/2; // Calculate the expected sum of numbers from 0 to n
        int s2=0;
        for(int i=0;i<n;i++){// Calculate the actual sum of numbers in the array
            s2 += arr[i];
        }
        int msum=totalsum-s2;// The missing number is the difference between the total sum and the actual sum
        return msum;
    }
}