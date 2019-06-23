package String;

public class LengthOfLongestSubstringTwoDistinct {

    public static int lengthOfLongestSubstringTwoDistinct(String s) {
        int i = 0, j = -1, maxLen = 0;
        for (int k = 1; k < s.length(); k++) {
            if (s.charAt(k) == s.charAt(k - 1)) continue;
            if (j >= 0 && s.charAt(k) != s.charAt(j)) {
                maxLen = Math.max(k - i, maxLen);
                i = j + 1;
            }
            j = k - 1;
        }
        return Math.max(maxLen, s.length() - i);
    }

    public static void main(String[] args) {
        String s = "abaac";
        System.out.println(lengthOfLongestSubstringTwoDistinct(s));
    }
}


