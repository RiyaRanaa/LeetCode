class Solution {
    public int maximumWealth(int[][] accounts) {
        int ans=Integer.MIN_VALUE;
        for(int person=0;person<accounts.length;person++){
            //for(int[]:ints accounts)
            int rowsum=0;
            for(int acc=0;acc<accounts[person].length;acc++){
                //for(int anInt:ints)
                rowsum+=accounts[person][acc];
                //rowsum+=anInt;
            }
            if(rowsum>ans){
                ans=rowsum;
            }
        }
        return ans;
    }

}