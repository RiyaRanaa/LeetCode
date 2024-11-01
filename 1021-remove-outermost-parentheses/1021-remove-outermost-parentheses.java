class Solution {
    public String removeOuterParentheses(String s) {
        int balance=0;
        StringBuilder res=new StringBuilder();
        for(char c:s.toCharArray()){
            if(c=='('){
                if(balance > 0){
                    res.append(c);
                }
                balance++;
            }
            else{
                balance--;
                if(balance > 0){
                    res.append(c);
                }
            }
        }
        return res.toString();
        
    }
}