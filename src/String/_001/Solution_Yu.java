package String._001;

public class Solution_Yu {
    public String replaceSpace(StringBuffer str) {
        String temp = str.toString();
        return temp.replaceAll(" ", "%20");
    }
}
