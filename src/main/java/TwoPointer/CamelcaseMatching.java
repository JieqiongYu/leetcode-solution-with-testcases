package TwoPointer;

import java.util.ArrayList;
import java.util.List;

public class CamelcaseMatching {
    public List<Boolean> camelMatch(String[] queries, String pattern) {
        List<Boolean> answer = new ArrayList<>(queries.length);

        char[] patternArray = pattern.toCharArray();
        for (String query : queries) {
            boolean isMatch = match(query.toCharArray(), patternArray);
            answer.add(isMatch);
        }

        return answer;
    }

    private boolean match(char[] query, char[] pattern) {
        // pointer is the pointer for pattern.
        int pointer = 0;
        for (char c : query) {
            if (pointer < pattern.length && c == pattern[pointer]) {
                pointer++;
            } else if (Character.isUpperCase(c)) {
                return false;
            }
        }

        return pointer == pattern.length;
    }
}
