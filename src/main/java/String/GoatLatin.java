package String;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


/**
 * [LeetCode 824] Goat Latin
 *
 * @author jieqiong.yu
 */

public class GoatLatin {

  public String toGoatLatin(String s) {
    Set<Character> set = new HashSet<>();
    set.add('a');
    set.add('e');
    set.add('i');
    set.add('o');
    set.add('u');

    String[] sArray = s.split(" ");
    List<String> result = new ArrayList<>();
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < sArray.length; i++) {
      if (set.contains(Character.toLowerCase(sArray[i].charAt(0)))) {
        sb.append(sArray[i].substring(0, sArray[i].length())).append("ma");
      } else {
        sb.append(sArray[i].substring(1, sArray[i].length())).append(sArray[i].charAt(0)).append("ma");
      }
      for (int j = 0; j <= i; j++) {
        sb.append("a");
      }
      result.add(sb.toString());
      sb.setLength(0);
    }

    StringBuilder answer = new StringBuilder();
    for (int i = 0; i < result.size(); i++) {
      answer.append(result.get(i)).append(" ");
    }
    return answer.toString().trim();

  }

}
