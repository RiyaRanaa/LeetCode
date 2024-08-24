class Solution {
    public String nearestPalindromic(String n) {
        int index=n.length()/2;
        boolean even=n.length()%2==0;
        if(even) index-=1;
        long left=Long.parseLong(n.substring(0,index+1));
        List<Long> cases=new ArrayList<>();
        cases.add(getPalindrome(left, even));
        cases.add(getPalindrome(left+1, even));
        cases.add(getPalindrome(left-1, even));
        cases.add((long)Math.pow(10,n.length()-1)-1);
        cases.add((long)Math.pow(10,n.length())+1);

        long result=0, diff=Integer.MAX_VALUE, num=Long.parseLong(n);
        for(long c:cases){
            if(c==num) continue;
            long curr=Math.abs(num-c);
            if(diff>curr){
                result=c;
                diff=curr;
            }
            else if(diff==curr){
                result=Math.min(result, c);
            }
        }
        return String.valueOf(result);


    }
    private long getPalindrome(long left,boolean even){
        long result=left;
        if(!even) left/=10;
        while(left>0){
            result=(result*10)+(left%10);
            left/=10;
        }
        return result;
    }
}