class Solution {
    public void moveZeroes(int[] nums) {
        // // Brute Force Approach
        // ArrayList<Integer>temp=new ArrayList<>();
        // int n=nums.length;
        // for(int i=0;i<n;i++){
        //     if(nums[i]!=0){
        //         temp.add(nums[i]);
        //     }
        // }
        // int non_zero=temp.size();
        // for(int i=0;i<non_zero;i++){
        //     nums[i]=temp.get(i);
        // }

        // for(int i=non_zero;i<n;i++){
        //     nums[i]=0;
        // }

        // optimal - two pionter
        int n=nums.length;
        int j=-1;
        for(int i=0;i<n;i++){
            if(nums[i]==0){
                j=i;
                break;
            }
        }
        if(j==-1) return;
        for(int i=j+1;i<n;i++){
            if(nums[i]!=0){
                int temp=nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
                j++;
            }
        }

    }
}