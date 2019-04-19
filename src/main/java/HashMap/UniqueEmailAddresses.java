package HashMap;

import java.util.HashSet;

public class UniqueEmailAddresses {
    public int numUniqueEmails(String[] emails) {
        HashSet set = new HashSet();
        for (int i = 0; i < emails.length; i++) {
            System.out.println(transform(emails[i]));
            if (!set.contains(transform(emails[i]))) {

                set.add(transform(emails[i]));
            }
        }
        return set.size();
    }

    public String transform(String email) {

        String local = email.substring(0, email.indexOf('@'));
        if (local.contains("+")) {
            local = local.substring(0, email.indexOf('+'));
        }

        char[] input = local.toCharArray();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < input.length; i++) {
            if (input[i] != '.') {
                sb.append(input[i]);
            }
        }

        sb.append(email.substring(email.indexOf('@'), email.length()));
        return sb.toString();
    }
}
