package String;

public class ShortestDistanceToACharacter {
    public int[] shortestToChar(String S, char C) {
        int len = S.length();
        int[] result = new int[len];

        // how to decide the inital value for previousIndex?
        // Think about the case if no C in S exists, what should the distance be?
        int previousIndex = -1 * len;
        for(int i = 0; i < len; i++) {
            if (S.charAt(i) == C) {
                previousIndex = i;
            }
            result[i] = i - previousIndex;
        }

        // how to decide the inital value for previousIndex?
        // Think about the case if no C in S exists, what should the distance be?
        previousIndex = 2 * len;
        for (int i = len - 1; i >= 0; i--) {
            if (S.charAt(i) == C) {
                previousIndex = i;
            }
            result[i] = Math.min(result[i], previousIndex - i);
        }

        return result;
    }
}
