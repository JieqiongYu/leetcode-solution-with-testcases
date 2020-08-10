package String;

import java.util.HashSet;
import java.util.Set;

public class UniqueEmailAddresses {
    public int numUniqueEmails(String[] emails) {
        Set set = new HashSet();
        for (int i = 0; i < emails.length; i++) {
            String uniqueEmail = transform(emails[i]);
            if (!set.contains(uniqueEmail)) {
                set.add(uniqueEmail);
            }
        }
        return set.size();
    }

    public String transform(String email) {
        String local = email.substring(0, email.indexOf("@"));
        String domain = email.substring(email.indexOf("@"));

        if (local.contains("+")) {
            local = local.substring(0, local.indexOf("+"));
        }

        local = local.replace(".", "");

        return local + domain;
    }
}
