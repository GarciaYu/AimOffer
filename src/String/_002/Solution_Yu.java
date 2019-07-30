package String._002;

public class Solution_Yu {
    public boolean match(char[] str, char[] pattern) {
        if (str == null || pattern == null) {
            return false;
        }
        int patternIndex = 0;
        for (int i = 0; i < str.length; i++) {
            boolean isMatch = false;
            if (str[i] == pattern[patternIndex]) {
                isMatch = true;
                patternIndex++;
            }
            if (pattern[patternIndex] == '.') {
                isMatch = true;
                patternIndex++;
            }
            if (!isMatch) {
                return false;
            }
        }
        return true;
    }
}
