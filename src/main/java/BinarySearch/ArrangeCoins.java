package BinarySearch;

public class ArrangeCoins {

    public int arrangeCoins(int n) {
        return binarySearch((long)n, 1, (long)n);
    }

    public int binarySearch(long n, long start, long end) {
        while (start + 1 < end) {
            long mid = start + (end - start) / 2;
            if (sum(mid) <= n) {
                start = mid;
            } else {
                end = mid;
            }
        }

        if (sum(end) == n) {
            return (int)end;
        }

        return (int)start;
    }

    public long sum(long n) {
        return n * (n + 1) / 2;
    }
}
