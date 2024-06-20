class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        int i=0;
        while (i<nums.length){
            int correct=nums[i]-1;
            if(nums[i]!=nums[correct]){
                swap(nums,i,correct);
            }
            else{i++;}
        }
        List<Integer>ans=new ArrayList<>();
        for(int index=0;index<nums.length;index++){
            if(nums[index]!=index+1){
                ans.add(nums[index]);
            }
        }
        return ans;
    }
    static void swap(int[]nums, int first, int second){
        int temp=nums[first];
        nums[first]=nums[second];
        nums[second]=temp;
    }
}