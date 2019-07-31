package String._003;

public class Solution_Yu {
    public boolean isNumeric(char[] str) {
        boolean hasMark = true;
        boolean hasE = true;
        boolean hasSign = false;

        for (int i = 0; i < str.length; i++) {
            boolean isNumer = false;
            if (str[i] <= 57 && str[i] >= 48) {
                isNumer = true;
            }
            if (!hasSign) {
                if (str[i] == '+' || str[i] == '-') {
                    isNumer = true;
                    hasSign = true;
                }
            }
            if (!hasMark) {
                if (str[i] == '.') {
                    isNumer = true;
                    hasMark = true;
                }
            }
            if (!hasE) {
                if (str[i] == 'e' || str[i] == 'E') {
                    isNumer = true;
                    hasE = true;
                    hasSign = false;
                    hasMark = true;
                }
            }
            if (!isNumer) {
                return false;
            }
            if (i == 0) {
                hasMark = false;
                hasE = false;
                hasSign = true;
            }
            if (i + 1 == str.length - 1) {
                hasMark = true;
                hasE = true;
            }
        }
        return true;
    }
}
