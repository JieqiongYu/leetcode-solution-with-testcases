package String;

public class LongestPalindromeSubstring {
    public String longestPalindrome(String s) {
        if (s == null || s.length() == 0) {
            return "";
        }

        int start = 0, end = 0;
        for (int i = 0; i < s.length(); i++) {
            int len1 = expandAroundCenter(s, i, i); // obvious center
            int len2 = expandAroundCenter(s, i, i + 1); // hidden center
            int len = Math.max(len1, len2); // 比较每次迭代哪个pattern更长
            if (len > end - start) { // 比较所有迭代，哪个substring更长
                start = i - (len - 1) / 2; // 减去center的长度， both for obvious and hidden
                end = i + len / 2;
            }
        }

        return s.substring(start, end + 1);
    }

    private int expandAroundCenter(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }

        return right - left - 1;
    }
}
