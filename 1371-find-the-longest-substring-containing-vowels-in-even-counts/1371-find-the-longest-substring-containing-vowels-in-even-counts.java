import java.util.HashMap;
import java.util.Map;

class Solution {
    public int findTheLongestSubstring(String s) {
        // Vowels with their respective bitmask values
        Map<Character, Integer> vowels = new HashMap<>();
        vowels.put('a', 1);
        vowels.put('e', 2);
        vowels.put('i', 4);
        vowels.put('o', 8);
        vowels.put('u', 16);
        
        // Map to store the first occurrence of each bitmask
        // Start with bitmask 0 at index -1, for cases where the entire string is valid
        Map<Integer, Integer> firstOccurrence = new HashMap<>();
        firstOccurrence.put(0, -1);
        
        int mask = 0; // Current bitmask
        int maxLength = 0; // Result variable to store the maximum length
        
        // Traverse the string
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            
            // If the character is a vowel, update the bitmask
            if (vowels.containsKey(c)) {
                mask ^= vowels.get(c);
            }
            
            // If the bitmask has been seen before, calculate the length of the substring
            if (firstOccurrence.containsKey(mask)) {
                maxLength = Math.max(maxLength, i - firstOccurrence.get(mask));
            } else {
                // If this is the first time we've seen this bitmask, store the index
                firstOccurrence.put(mask, i);
            }
        }
        
        return maxLength;
    }
}