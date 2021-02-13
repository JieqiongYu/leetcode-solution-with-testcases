package HashMap;

import java.util.HashMap;
import java.util.Map;

public class LongestAbsoluteFilePath {
    public int lengthLongestPath(String input) {
        if (input == null || input.isEmpty())
            return 0;

        int answer = 0;

        // to keep the length of every sub-dir at same level.
        // It stores length of string at each level.
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 0);

        // 1. Split the string by `\n`
        String[] line = input.split("\n");

        for (String s : line) {
            // 2. Find the last index of `\t`
            int level = s.lastIndexOf('\t') + 1;

            // 3. Compute the remaining length of string without `\t`
            int len = s.length() - level;

            // 4. Check is this a file or not
            if (!s.contains(".")) {
                // a) if a sub-dir, than append its length to next level sub-dir
                map.put(level + 1, map.get(level) + len + 1);
            } else {
                // b) if it's a file, compute the length of string for this file.
                // To compute, get the level at this file is and add the length of the file
                answer = Math.max(answer, map.get(level) + len);
            }
        }

        return answer;
    }
}
