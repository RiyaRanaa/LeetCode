import java.util.*;

class Solution {
    public int[] frequencySort(int[] nums) {
        // Step 1: Count frequencies of each number
        Map<Integer, Integer> freq = new HashMap<>();
        for (int num : nums) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }
        
        // Step 2: Sort based on frequency and value
        Integer[] sortedNums = new Integer[nums.length];
        for (int i = 0; i < nums.length; i++) {
            sortedNums[i] = nums[i];
        }
        
        Arrays.sort(sortedNums, (a, b) -> {
            if (freq.get(a).equals(freq.get(b))) {
                return b - a; // Sort by value in decreasing order
            } else {
                return freq.get(a) - freq.get(b); // Sort by frequency in increasing order
            }
        });
        
        // Convert Integer[] back to int[]
        int[] result = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            result[i] = sortedNums[i];
        }
        
        return result;
    }
}
