package questions_30;

public class make_string_great {
    class Solution {
    public String makeGood(String s) {
            StringBuilder sb = new StringBuilder();
            for(char c : s.toCharArray()) {
                if(sb.length() > 0) {
                    char last = sb.charAt(sb.length() - 1);

                    if((Character.isLowerCase(c) && Character.toUpperCase(c) == last) ||
                        (Character.isUpperCase(c) && Character.toLowerCase(c) == last)) {
                        sb.deleteCharAt(sb.length() - 1);
                        continue;
                    }
                }
                sb.append(c);
            }

            return sb.toString();
        }
    }
}
