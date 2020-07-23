package Math;

public class PalindromeNumber {
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }

        int div = 1;
        while (x / div >= 10) {
            div *= 10;
        }

        while (x != 0) {
            int start = x / div;
            int end = x % 10;
            if (start != end)
                return false;
            // `x %` div removes the first digit, `/ 10` removes the last digit.
            x = (x % div) / 10;
            div /= 100;
        }

        return true;
    }
}
