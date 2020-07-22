package String;

public class LongestSubstringWithoutRepeatingCharacters {
    public int lengthOfLongestSubstring(String s) {
        int[] charMap = new int[256];

        int left;
        int right = 0;
        int result = 0;

        for (left = 0; left < s.length(); left++) {
            while (right < s.length() && charMap[s.charAt(right)] == 0) {
                charMap[s.charAt(right)] = 1;
                right++;
                result = Math.max(result, right - left);
            }
            charMap[s.charAt(left)] = 0;
        }

        return result;
    }
}
