package BreadthFirstSearch.TwoDArrays;

import java.util.LinkedList;
import java.util.Queue;

public class WallsAndGates {
    int GATE = 0;
    int EMPTY = Integer.MAX_VALUE;

    public void wallsAndGates(int[][] rooms) {
        if (rooms.length == 0) {
            return;
        }

        int row = rooms.length;
        int col = rooms[0].length;

        Queue<Point> queue = new LinkedList<>();

        // traverse 2d array
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (rooms[i][j] == GATE) {
                    queue.offer(new Point(i, j));
                }
            }
        }

        int[][] moves = {{-1, 0}, {0, 1}, {1, 0}, {0, -1}};
        
        // BFS
        while (!queue.isEmpty()) {
            Point point = queue.poll();
            for (int[] move : moves) {
                Point newPoint = new Point(point.x + move[0], point.y + move[1]);
                if (!inBound(rooms, newPoint) || rooms[newPoint.x][newPoint.y] != EMPTY) {
                    continue;
                }
                // change process
                rooms[newPoint.x][newPoint.y] = rooms[point.x][point.y] + 1;
                queue.offer(newPoint);
            }
        }
    }

    public boolean inBound(int[][] rooms, Point point) {
        int row = rooms.length;
        int col = rooms[0].length;

        return point.x >= 0 && point.x < row && point.y >= 0 && point.y < col;
    }

    private static class Point {
        int x;
        int y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}
