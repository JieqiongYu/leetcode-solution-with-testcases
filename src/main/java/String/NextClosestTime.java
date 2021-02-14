package String;

import java.util.HashSet;
import java.util.Set;

public class NextClosestTime {
    public String nextClosestTime(String time) {
        int currentTime = 60 * Integer.parseInt(time.substring(0, 2));
        currentTime += Integer.parseInt(time.substring(3));
        Set<Integer> allowed = new HashSet<>();
        for (char c : time.toCharArray()) {
            if (c != ':') {
                allowed.add(c - '0');
            }
        }

        while (true) {
            currentTime = (currentTime + 1) % (60 * 24);
            int[] digits = new int[]{currentTime / 60 / 10, currentTime / 60 % 10, currentTime % 60 / 10, currentTime % 60 % 10};
            search:
            {
                for (int d : digits) if (!allowed.contains(d)) break search;
                return String.format("%02d:%02d", currentTime / 60, currentTime % 60);
            }
        }
    }
}
