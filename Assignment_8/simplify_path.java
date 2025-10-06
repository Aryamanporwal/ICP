package Assignment_8;

import java.util.ArrayList;
import java.util.List;

public class simplify_path {
        class Solution {
        public String simplifyPath(String path) {
            String[] parts = path.split("/");
            List<String> result = new ArrayList<>();
            for (String part : parts) {
                if (part.equals("..")) {
                    if (!result.isEmpty()) {
                        result.remove(result.size() - 1);
                    }
                } else if (!part.equals(".") && !part.isEmpty()) {
                    result.add(part);
                }
            }
            return "/" + String.join("/", result);  
        }
    }
}
