package String;

/**
 * [LeetCode][616] Add Bold Tag in String.
 *
 * @author jieqiong.yu
 */
public class AddBoldTagInString {
    
    public String addBoldTag(String s, String[] dict) {
        boolean[] mark = new boolean[s.length()];
        
        for (String word : dict) {
            for (int i = 0;i <= s.length() - word.length(); i++) {
                if (s.substring(i, i + word.length()).equals(word)) {
                    for (int j = i; j < i + word.length(); j++) {
                        mark[j] = true;
                    }
                }
            }
        }
        
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (mark[i] && (i == 0 || !mark[i-1])) {
                sb.append("<b>");
            }
            sb.append(s.charAt(i));
            if (mark[i] && (i == s.length() - 1 || !mark[i+1])) {
                sb.append("</b>");
            }
        }
        
        return sb.toString();
    }
}
