package String;

import java.util.ArrayList;
import java.util.List;

public class ReorderDataInLogFiles {

    static class Log {
        String id;
        String content;
        boolean isDigitLog;

        public Log(String raw) {
            int index = raw.indexOf(" ");
            id = raw.substring(0, index);
            content = raw.substring(index + 1, raw.length());
            isDigitLog = Character.isDigit(content.charAt(0));
        }

        public String toString() {
            return id + " " + content;
        }
    }

    public String[] reorderLogFiles(String[] logs) {
        List<Log> list = new ArrayList<>();
        for (int i = 0; i < logs.length; i++) {
            list.add(new Log(logs[i]));
        }
        list.sort(this::compare);
        for (int i = 0; i < list.size(); i++) {
            logs[i] = list.get(i).toString();
        }

        return logs;
    }

    /**
     * compare interface
     *
     * @param a the first object
     * @param b the second object
     * @return >= 1 (a > b); 0 (a == b); <= -1 (a < b);
     */
    public int compare(Log a, Log b) {
        if (!a.isDigitLog && b.isDigitLog) return -1;
        if (a.isDigitLog && !b.isDigitLog) return 1;
        if (a.isDigitLog) return 0;
        int r = a.content.compareTo(b.content);
        return r != 0 ? r : a.id.compareTo(b.id);
    }
}
