class Solution {
    public int findComplement(int num) {
        // if (num == 0) {
        //     return 1;
        // }
        int mask = (Integer.highestOneBit(num) << 1) - 1;
        return num^mask;
    }
}