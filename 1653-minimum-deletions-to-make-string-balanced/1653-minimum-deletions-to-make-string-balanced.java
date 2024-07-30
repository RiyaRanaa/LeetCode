class Solution {
    public int minimumDeletions(String s) {
        int n=s.length();
        int[] A = new int[n];
        A[n-1]=s.charAt(n-1)=='a'?1:0;
        for(int i=n-2;i>=0;i--){
            A[i]=A[i+1]+(s.charAt(i)=='a'?1:0);
        }
        int result=Integer.MAX_VALUE;
        int bCount=0;
        for(int i=0;i<n;i++){
            if(s.charAt(i)=='b'){
                result=Math.min(result,bCount+A[i]);
                bCount++;
            }
        }
        result=Math.min(result,bCount);
        return result;
    }
}