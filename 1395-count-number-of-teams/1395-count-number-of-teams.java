class Solution {
    public int numTeams(int[] rating) {
        int count=0;
        for(int i=0;i<rating.length;i++){
            int less=0;
            int greater=0;
            for(int j=0;j<i;j++){
                if(rating[i]>rating[j]){
                    ++less;
                }
            }
            for(int j=i+1;j<rating.length;j++){
                if(rating[i]<rating[j]){
                    ++greater;
                }
            }
            count += less * greater;
            count += (i-less)*(rating.length-1-i-greater);
        }
        return count;
    }
}