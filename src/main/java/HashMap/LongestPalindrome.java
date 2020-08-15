package HashMap;

import java.util.HashSet;
import java.util.Set;

public class LongestPalindrome {
    public int longestPalindrome(String s) {
        Set<Character> set = new HashSet<>();
        for (char c : s.toCharArray()) {
            if (!set.contains(c)) {
                set.add(c);
            } else {
                set.remove(c);
            }
        }

        int remove = set.size();
        return remove == 0 ? s.length() : s.length() - remove + 1;
    }
}
