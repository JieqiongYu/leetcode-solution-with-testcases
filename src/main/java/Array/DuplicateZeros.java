package Array;

public class DuplicateZeros {
    public void duplicateZeros(int[] arr) {
        int zeroCount = 0;
        for (int num : arr) {
            if (num == 0) {
                zeroCount++;
            }
        }

        if (zeroCount == 0) {
            return;
        }

        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] == 0) {
                zeroCount--;
            }

            int newIndex = i + zeroCount;
            if (newIndex >= arr.length) {
                continue;
            }

            arr[newIndex] = arr[i];
            if (arr[i] == 0 && newIndex + 1 < arr.length) {
                arr[newIndex + 1] = 0;
            }
        }
    }
}
