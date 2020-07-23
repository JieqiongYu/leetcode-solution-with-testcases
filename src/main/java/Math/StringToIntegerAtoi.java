package Math;

public class StringToIntegerAtoi {
    public int myAtoi(String str) {
        int maxDiv10 = Integer.MAX_VALUE / 10;
        int i = 0;
        int len = str.length();

        while (i < len && Character.isWhitespace(str.charAt(i)))
            i++;

        int sign = 1;
        if (i < len && str.charAt(i) == '+') {
            i++;
        } else if (i < len && str.charAt(i) == '-') {
            sign = -1;
            i++;
        }

        int sum = 0;
        while (i < len && Character.isDigit(str.charAt(i))) {
            int digit = Character.getNumericValue(str.charAt(i));
            if (sum > maxDiv10 || (sum == maxDiv10 && digit > 7)) {
                return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }
            sum = sum * 10 + digit;
            i++;
        }

        return sum * sign;
    }
}
