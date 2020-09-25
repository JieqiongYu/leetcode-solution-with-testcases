package String;

import java.util.Arrays;
import java.util.Comparator;

public class LargestNumber {
    public String largestNumber(int[] nums) {
        String[] numsString = new String[nums.length];
        for (int i = 0; i < nums.length; i++) {
            // convert integer to string, as it would be much easier to compare each character in a string
            // than comparing each digit in an integer.
            numsString[i] = String.valueOf(nums[i]);
        }

        Arrays.sort(numsString, new LargestNumberComparator());

        StringBuilder ans = new StringBuilder();
        for (String s : numsString) {
            ans.append(s);
        }

        String answer = ans.toString();

        // remove the leading '0'
        if (answer.charAt(0) == '0') {
            return "0";
        }

        return answer;
    }

    static class LargestNumberComparator implements Comparator<String> {
        public int compare(String a, String b) {
            String ab = a.concat(b);
            String ba = b.concat(a);
            return ba.compareTo(ab);
        }
    }
}
