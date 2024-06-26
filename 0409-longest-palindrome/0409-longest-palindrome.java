class Solution {
    public int longestPalindrome(String s) {
        int[]count=new int[128];
        for(char ch:s.toCharArray()){
            count[ch]++;
        }
        int result=0;
        for(int i=0;i<128;i++){
            int val=count[i];
            result+=(val/2)*2;
            if(result%2==0 && val%2==1){
                result++;
            }
        }
        return result;
        
    }
}