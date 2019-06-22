package BreadthFirstSearch.TwoDArrays;

import java.util.LinkedList;
import java.util.Queue;

public class NumberOfIslands {

    private class Point {
        int x;
        int y;
        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    public int numIslands(char[][] grid) {
        if (grid == null || grid.length == 0 || grid[0].length == 0) {
            return 0;
        }

        int row = grid.length;
        int col = grid[0].length;

        int island = 0;

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (grid[i][j] == '1') {
                    markByBFS(grid, i, j);
                    island++;
                }
            }
        }

        return island;
    }

    public void markByBFS(char[][] grid, int x, int y) {
        int[][] moves = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};

        Queue<Point> queue = new LinkedList<>();
        queue.offer(new Point(x, y));
        grid[x][y] = '0';

        while (!queue.isEmpty()) {
            Point point = queue.poll();
            for (int[] move : moves) {
                Point newPoint = new Point(point.x + move[0], point.y + move[1]);
                if (!inBound(grid, newPoint)) {
                    continue;
                }
                if (grid[newPoint.x][newPoint.y] == '1') {
                    queue.offer(newPoint);
                    grid[newPoint.x][newPoint.y] = '0';
                }
            }
        }
    }

    public boolean inBound(char[][] grid, Point point) {
        int row = grid.length;
        int col = grid[0].length;

        return point.x >= 0 && point.y >= 0 && point.x < row && point.y < col;
    }
}
