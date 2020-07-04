package BreadthFirstSearch.TwoDArrays;

import java.util.LinkedList;
import java.util.Queue;

public class NumberOfIslands {
    private static class Point {
        int x;
        int y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    public int numIslands(char[][] grid) {
        int row = grid.length;
        int col = grid[0].length;
        int island = 0;

        // traverse 2d array
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                // if it is a `1`, mark all the adjacent item as `0`, and
                // add the island count.
                if (grid[i][j] == '1') {
                    markByBFS(grid, i, j);
                    island++;
                }
            }
        }

        return island;
    }

    public void markByBFS(char[][] grid, int x, int y) {
        // clockwise direction, left, up, right, down
        int[][] moves = {{-1, 0}, {0, 1}, {1, 0}, {0, -1}};
        Queue<Point> queue = new LinkedList<>();
        queue.offer(new Point(x, y));
        // change the first element as `0`
        grid[x][y] = '0';

        while (!queue.isEmpty()) {
            Point point = queue.poll();
            for (int[] move : moves) {
                Point newPoint = new Point(point.x + move[0], point.y + move[1]);
                if (!inBound(grid, newPoint)) {
                    // if the point is out of the current 2d array boundary, do nothing
                    continue;
                }
                // mark starts
                if (grid[newPoint.x][newPoint.y] == '1') {
                    queue.offer(newPoint);
                    grid[newPoint.x][newPoint.y] = '0';
                }
            }
        }
    }

    private boolean inBound(char[][] grid, Point point) {
        int row = grid.length;
        int col = grid[0].length;

        return point.x >= 0 && point.x < row && point.y >= 0 && point.y < col;
    }
}
