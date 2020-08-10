package Math;

import java.util.HashMap;
import java.util.Map;

public class ExcelSheetColumnNumber {
    public int titleToNumber(String s) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < 26; i++) {
            map.put((int)'A' + i, i+1);
        }

        int answer = 0;

        for (int i = 0; i < s.length(); i++) {
            answer += map.get((int)s.charAt(i)) * Math.pow(26, s.length() - 1 - i);
        }

        return answer;
    }
}
