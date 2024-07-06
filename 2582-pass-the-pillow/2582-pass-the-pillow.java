class Solution {
    public int passThePillow(int n, int time) {
        int curr_t=0;
        boolean rev=false;
        int p_pos=1;
        while(curr_t<time){
            if(!rev){
                p_pos++;
            }
            else{
                p_pos--;
            }
            if(p_pos==1 || p_pos==n){
                rev=!rev;
            }
            curr_t++;
        }
        return p_pos;
    }
}