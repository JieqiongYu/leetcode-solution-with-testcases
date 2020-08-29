package Codility;

import java.util.HashMap;

public class Solution2 {
    public int solution(int[] A) {
        int ans = 0;
        int l = 0, r = 0;
        HashMap<Integer, Integer> map = new HashMap<>();

        while (r < A.length) {
            if (map.size() <= 2) {
                int num = A[r];
                map.put(num, r);
                r++;
            }

            if (map.size() > 2) {
                int left = A.length;
                for (int i : map.values()) {
                    left = Math.min(left, i);
                }
                int num = A[left];
                map.remove(num);
                l = left + 1;
            }

            ans = Math.max(ans, r - l);
        }

        return ans;
    }
}
