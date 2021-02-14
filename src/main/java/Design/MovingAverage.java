package Design;

import java.util.LinkedList;
import java.util.Queue;

public class MovingAverage {

    private double previousSum = 0d;
    private Queue<Integer> currentWindow;
    private int maxSize;

    /**
     * Initialize your data structure here.
     */
    public MovingAverage(int size) {
        currentWindow = new LinkedList<>();
        maxSize = size;
    }

    public double next(int val) {
        if (currentWindow.size() == maxSize) {
            previousSum -= currentWindow.remove();
        }

        previousSum += val;
        currentWindow.add(val);
        return Math.round(previousSum / currentWindow.size() * 100000d) / 100000d;
    }
}
