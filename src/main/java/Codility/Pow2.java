package Codility;

import java.util.ArrayList;
import java.util.List;

public class Pow2 {
    public int[] solution(int[] A) {
        int X = getX(A);
        int Y = getCelling(X);
        return getArray(Y);
    }

    private int getX(int[] A) {
        if (A.length == 0) {
            return 0;
        }

        int sum = 0;
        for (int i = 0; i < A.length; i++) {
            sum += A[i] * Math.pow(-2, i);
        }

        return sum;
    }

    private int getCelling(int x) {
        return (int) Math.ceil((double) x / 2);
    }

    private int[] getArray(int X) {
        List<Integer> list = new ArrayList<>();
        int number = X;
        while (number != 0) {
            int i = number % -2;
            number /= -2;
            if (i < 0) {
                i += Math.abs(-2);
                number++;
            }

            list.add(i);
        }
        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }
}
