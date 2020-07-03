package HashMap;

import java.util.Arrays;
import java.util.HashSet;

public class PrisonAfterNDays {
    protected int[] nextDay(int[] cells) {
        int[] newCells = new int[cells.length];
        newCells[0] = 0;
        for (int i = 1; i < cells.length - 1; i++)
            newCells[i] = (cells[i - 1] == cells[i + 1]) ? 1 : 0;
        newCells[cells.length - 1] = 0;
        return newCells;
    }

    public int[] prisonAfterNDays(int[] cells, int N) {
        HashSet<String> set = new HashSet<>();
        boolean hasCycle = false;
        int count = 0;

        for (int i = 0; i < N; i++) {
            int[] next = nextDay(cells);
            String s = Arrays.toString(next);
            if (!set.contains(s)) {
                set.add(s);
                count++;
            } else {
                hasCycle = true;
                break;
            }
            cells = next;
        }

        if (hasCycle) {
            N = N % count;
            for (int i = 0; i < N; i++) {
                cells = nextDay(cells);
            }
        }

        return cells;
    }
}
