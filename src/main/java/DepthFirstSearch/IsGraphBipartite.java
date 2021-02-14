package DepthFirstSearch;

import java.util.Arrays;
import java.util.Stack;

public class IsGraphBipartite {
    public boolean isBipartite(int[][] graph) {
        int nodeCount = graph.length;
        int[] color = new int[nodeCount];
        // -1 means uncolored.
        Arrays.fill(color, -1);

        for (int node = 0; node < nodeCount; node++) {
            if (color[node] == -1) {
                Stack<Integer> stack = new Stack<>();
                stack.push(node);
                color[node] = 0;

                while (!stack.isEmpty()) {
                    Integer current = stack.pop();
                    for (int neighbor : graph[current]) {
                        if (color[neighbor] == -1) {
                            stack.push(neighbor);
                            color[neighbor] = color[current] ^ 1;
                        } else if (color[neighbor] == color[current]) {
                            return false;
                        }
                    }
                }
            }
        }

        return true;
    }
}
