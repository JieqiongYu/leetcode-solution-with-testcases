package String;

public class ZigZagConversion {
    public String convert(String s, int numRows) {
        char[] c = s.toCharArray();
        int len = c.length;
        // initialization
        StringBuilder[] sb = new StringBuilder[numRows];
        for (int i = 0; i < sb.length; i++) {
            sb[i] = new StringBuilder();
        }

        int idx = 0;
        while (idx < len) {
            // 处理zigzag中竖下来的case
            for (int i = 0; i < numRows && idx < len; i++) {
                sb[i].append(c[idx++]);
            }
            // 处理zigzag中斜上去的case
            for (int i = numRows - 2; i >= 1 && idx < len; i--) {
                sb[i].append(c[idx++]);
            }
        }

        // output the final result
        for (int i = 1; i < sb.length; i++) {
            sb[0].append(sb[i]);
        }

        return sb[0].toString();
    }
}
