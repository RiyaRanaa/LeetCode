import java.util.HashSet;
import java.util.Set;

class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        Set<Character> allowedChars = new HashSet<>();
        for (char ch : allowed.toCharArray()) {
            allowedChars.add(ch);
        }
        
        int count = 0;
        for (String word : words) {
            boolean isConsistent = true;
            for (char c : word.toCharArray()) {
                if (!allowedChars.contains(c)) {
                    isConsistent = false;
                    break;
                }
            }
            if (isConsistent) {
                count++;
            }
        }
        
        return count;
    }
}