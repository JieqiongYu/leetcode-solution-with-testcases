package leetcode.HashMap;
import java.util.*;

public class IsomorphicStrings{

    public static boolean isIsomorphic(String s, String t) {
        Map<Character, Character> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (map.containsKey(s.charAt(i))) {
                if (t.charAt(i) == map.get(s.charAt(i))) {
                    continue;
                } else {
                    return false;
                }
            } else if (map.containsValue(t.charAt(i))) {
                return false;
            }
            map.put(s.charAt(i), t.charAt(i));
        }
        return true;
    }

    public static void main(String[] args) {

        String testS1 = "egg";
        String testT1 = "add";
        boolean result1 = isIsomorphic(testS1, testT1);
        boolean expected1 = true;

        String testS2 = "foo";
        String testT2 = "bar";
        boolean result2 = isIsomorphic(testS2, testT2);
        boolean expected2 = false;

        String testS3 = "paper";
        String testT3 = "title";
        boolean result3 = isIsomorphic(testS3, testT3);
        boolean expected3 = true;

        String testS4 = "ab";
        String testT4 = "aa";
        boolean result4 = isIsomorphic(testS4, testT4);
        boolean expected4 = false;
        
        if (result1 == expected1 && result2 == expected2 && result3 == expected3 && result4 == expected4) {
            System.out.println("All testcases passed");
        } else {
            System.out.println("Something wrong with the solution, plesae take a look.");
        }
        
    }
}