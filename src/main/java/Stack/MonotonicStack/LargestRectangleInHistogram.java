package Stack.MonotonicStack;

import java.util.ArrayDeque;
import java.util.Deque;

public class LargestRectangleInHistogram {
    public int largestRectangleArea(int[] heights) {
        // Initialize a monotonic stack.
        Deque<Integer> stack = new ArrayDeque<>();
        // -1 is the dummy end of the stack, as in heights, the numbers are all non-negative.
        stack.push(-1);
        int length = heights.length;
        int maxArea = 0;
        // push the index of all elements in heights to the monotonic stack.
        for (int i = 0; i < length; i++) {
            // when spotting the element on top is larger than current element, pop it out.
            while (stack.peek() != -1 && (heights[stack.peek()] >= heights[i])) {
                int currentHeight = heights[stack.pop()];
                int currentWidth = i - stack.peek() - 1;
                maxArea = Math.max(maxArea, currentHeight * currentWidth);
            }
            stack.push(i);
        }

        while (stack.peek() != -1) {
            int currentHeight = heights[stack.pop()];
            int currentWidth = length - stack.peek() - 1;
            maxArea = Math.max(maxArea, currentHeight * currentWidth);
        }

        return maxArea;
    }
}
