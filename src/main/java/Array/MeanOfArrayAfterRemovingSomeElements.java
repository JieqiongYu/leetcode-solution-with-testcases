package Array;

import java.util.Arrays;

public class MeanOfArrayAfterRemovingSomeElements {
    public double trimMean(int[] arr) {
        Arrays.sort(arr);

        int startIndex = (int) (arr.length * 0.05);
        int endIndex = arr.length - startIndex;
        double sum = 0d;
        for (int i = startIndex; i < endIndex; i++) {
            sum += arr[i];
        }

        double answer = (sum / (arr.length * 0.9));
        return Math.round(answer * 100000d) / 100000d;
    }
}
