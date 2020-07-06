package Array;

public class TrappingRainWater {
    public int trap(int[] height) {
        int peakIndex = 0;
        for (int i = 0; i < height.length; i++) {
            if (height[i] > height[peakIndex]) {
                peakIndex = i;
            }
        }

        int leftMostBar = 0;
        int water = 0;
        for (int i = 0; i < peakIndex; i++) {
            if (height[i] > leftMostBar) {
                leftMostBar = height[i];
            } else {
                water = water + leftMostBar - height[i];
            }
        }

        int rightMostBar = 0;
        for (int i = height.length - 1; i > peakIndex; i--) {
            if (height[i] > rightMostBar) {
                rightMostBar = height[i];
            } else {
                water = water + rightMostBar - height[i];
            }
        }

        return water;
    }
}
