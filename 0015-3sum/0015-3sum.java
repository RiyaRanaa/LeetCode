class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        if(nums==null || nums.length < 3) return new ArrayList<>();
        Arrays.sort(nums);
        Set<List<Integer>> result=new HashSet<>();
        for(int i=0;i<nums.length-2;i++){
            int s=i + 1;
            int e=nums.length-1;
            while(s<e){
                int sum=nums[i]+nums[s]+nums[e];
                if(sum==0){
                    result.add(Arrays.asList(nums[i],nums[s],nums[e]));
                    s++;
                    e--;
                }
                else if(sum < 0){
                    s++;
                }
                else{
                    e--;
                }
            }
        }
        return new ArrayList<>(result);
    }
}