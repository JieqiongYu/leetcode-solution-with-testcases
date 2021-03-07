package String;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class MinimumLengthEncoding {
    public int minimumLengthEncoding(String[] words) {
        Set<String> target = new HashSet<>(Arrays.asList(words));
        for (String word : words) {
            for (int k = 1; k < word.length(); k++) {
                target.remove(word.substring(k));
            }
        }

        int answer = 0;
        for (String word : target) {
            answer += word.length() + 1;
        }

        return answer;
    }
}
