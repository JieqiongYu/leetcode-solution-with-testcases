package DepthFirstSearch;

import javafx.util.Pair;

import java.util.*;

public class NumberOfDistinctIslands {

    private int[][] grid;
    private boolean[][] visited;
    private Set<Pair<Integer, Integer>> currentIsland;
    private int currentRowStart;
    private int currentColStart;

    public int numDistinctIslands(int[][] grid) {
        this.grid = grid;
        this.visited = new boolean[grid.length][grid[0].length];
        Set<Set<Pair<Integer, Integer>>> islands = new HashSet<>();
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                this.currentIsland = new HashSet<>();
                this.currentRowStart = i;
                this.currentColStart = j;
                dfs(i, j);
                if (!currentIsland.isEmpty())
                    islands.add(currentIsland);
            }
        }

        return islands.size();
    }

    private void dfs(int row, int col) {
        if (row < 0 || row >= grid.length || col < 0
                || col >= grid[0].length || grid[row][col] == 0 || visited[row][col])
            return;
        visited[row][col] = true;
        currentIsland.add(new Pair<>(row - currentRowStart, col - currentColStart));

        dfs(row + 1, col);
        dfs(row - 1, col);
        dfs(row, col + 1);
        dfs(row, col - 1);
    }
}
