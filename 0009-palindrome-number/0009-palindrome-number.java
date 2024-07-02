class Solution {
    public boolean isPalindrome(int x) {
        int temp,reverse=0;
        temp=x;
        while(temp>0){
            int end=temp%10;
            reverse=reverse*10+end;
            temp=temp/10;
        }
        return reverse==x;
    }
}