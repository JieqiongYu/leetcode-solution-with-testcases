package String;

public class DefangingAnIpAddress {
    public String defangIPaddr(String address) {
        char[] addressToChar = address.toCharArray();
        StringBuilder answer = new StringBuilder();
        for (char c : addressToChar) {
            if (c == '.') {
                answer.append('[').append('.').append(']');
            } else {
                answer.append(c);
            }
        }

        return answer.toString();
    }
}
