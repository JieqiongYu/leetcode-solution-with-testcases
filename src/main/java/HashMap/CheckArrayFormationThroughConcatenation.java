package HashMap;

import java.util.HashMap;

public class CheckArrayFormationThroughConcatenation {
    public boolean canFormArray(int[] arr, int[][] pieces) {
        HashMap<Integer, int[]> map = new HashMap<>();

        for (int[] piece : pieces) {
            map.put(piece[0], piece);
        }

        for (int i = 0; i < arr.length;) {
            if (!map.containsKey(arr[i])) {
                return false;
            }

            int[] pieceSubArray = map.get(arr[i]);
            for (int num : pieceSubArray) {
                if (num != arr[i]) {
                    return false;
                }
                i++;
            }
        }

        return true;
    }
}
