class Solution {
    public boolean canBeEqual(int[] target, int[] arr) {
        int n=target.length;
        if(n!=arr.length){
            return false;
        }
        int[] a=new int[1001];
        for(int i=0;i<n;i++){
            a[target[i]]++;
            a[arr[i]]--;
        }
        for(int c:a){
            if(c!=0){
                return false;
            }
        }
        return true;
    }
}