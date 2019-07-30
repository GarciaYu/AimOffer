package Array._002;

import java.util.*;

public class Solution_Yu {
    public boolean duplicate(int numbers[], int length, int[] duplication) {
        if (numbers == null || length <= 0) {
            return false;
        }
        Map<Integer, Integer> timesMap = new HashMap<>();
        for (int i = 0; i < length; i++) {
            if (timesMap.containsKey(numbers[i])) {
                duplication[0] = numbers[i];
                return true;
            } else {
                timesMap.put(numbers[i], 1);
            }
        }

        return false;
    }
}
