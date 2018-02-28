package Math;

import java.util.*;

/**
 * [LeetCode][645]Set Mismatch.
 *
 * @author jieqiong.yu
 */
public class SetMismatch {

    public int[] findErrorNums(int[] nums) {
        
        int[] answer = new int[2];
        
        if (nums == null || nums.length == 0) {
            return answer;
        }

        Map<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        int sum = 0;
        int expected = (1 + nums.length) * nums.length / 2;
        for (int key : map.keySet()) {
            sum += key;
            if (map.get(key) > 1) {
                answer[0] = key;
            }
        }
        answer[1] = expected - sum;
        return answer;
    }
}
