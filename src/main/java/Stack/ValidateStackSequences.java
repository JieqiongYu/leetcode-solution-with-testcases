package Stack;

import java.util.ArrayDeque;
import java.util.Deque;

public class ValidateStackSequences {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        Deque<Integer> stack = new ArrayDeque<>();

        int pointer = 0;
        for (int num : pushed) {
            stack.push(num);
            while (!stack.isEmpty() && pointer < pushed.length && stack.peek() == popped[pointer]) {
                stack.pop();
                pointer++;
            }
        }

        return pointer == pushed.length;
    }
}
