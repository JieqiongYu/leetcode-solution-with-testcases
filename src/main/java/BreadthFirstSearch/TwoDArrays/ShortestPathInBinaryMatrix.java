package BreadthFirstSearch.TwoDArrays;

import java.util.LinkedList;
import java.util.Queue;

public class ShortestPathInBinaryMatrix {

    private int[][] dir = new int[][]{{0, 1}, {0, -1}, {1, 0}, {-1, 0}, {1, -1}, {-1, 1}, {1, 1,}, {-1, -1}};

    public int shortestPathBinaryMatrix(int[][] grid) {
        int row = grid.length;
        int col = grid[0].length;

        if (grid[0][0] == 1 || grid[row - 1][col - 1] == 1) {
            return -1;
        }

        boolean[][] visited = new boolean[row][col];
        visited[0][0] = true;
        // Initialize queue for BFS.
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{0, 0});

        int answer = 0;
        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                int[] pop = queue.poll();
                // when BFS reaches the end of the binary matrix.
                if (pop[0] == row - 1 && pop[1] == col - 1) {
                    return answer + 1;
                }

                for (int d = 0; d < 8; d++) {
                    int nextX = dir[d][0] + pop[0];
                    int nextY = dir[d][1] + pop[1];

                    if (nextX >= 0 && nextX < row && nextY >= 0 && nextY < col && !visited[nextX][nextY] && grid[nextX][nextY] == 0) {
                        queue.add(new int[]{nextX, nextY});
                        visited[nextX][nextY] = true;
                    }
                }
            }
            answer++;
        }

        return -1;
    }
}
