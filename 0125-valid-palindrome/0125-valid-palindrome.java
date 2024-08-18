class Solution {
    public boolean isPalindrome(String s) {
        String after=s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int start=0;
        int e=after.length()-1;
        while(start<e){
            if(after.charAt(start) != after.charAt(e)){
                return false;
            }
            start++;
            e--;
        }
        return true;
    }
}