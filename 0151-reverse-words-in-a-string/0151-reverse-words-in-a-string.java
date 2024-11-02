class Solution {
    public String reverseWords(String s) {
        s=s.trim();
        int n=s.length();
        StringBuilder res=new StringBuilder();

        int end=n-1;
        while(end >=0){
            while(end >= 0 && s.charAt(end)==' '){
                end--;
            }
            if(end<0) break;

            int start=end;
            while(start >= 0 && s.charAt(start)!= ' '){
                start--;
            }
            res.append(s,start+1, end+1).append(' ');
            end=start=start-1;
        }
        if(res.length()>0){
            res.setLength(res.length()-1);
        }
        return res.toString();
    }
}