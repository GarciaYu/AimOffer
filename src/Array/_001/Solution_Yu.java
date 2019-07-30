package Array._001;

public class Solution_Yu {
    public boolean Find(int target, int[][] array) {
        int rows = array.length;
        int cols = array[0].length;
        if(cols == 0){
            return false;
        }

        for (int i = 0; i < rows; i++) {
            if (target < array[i][0] || target > array[i][cols - 1]) {
                continue;
            }
            for (int j = 0; j < cols; j++) {
                if (array[i][j] == target) {
                    return true;
                }
            }
        }
        return false;
    }
}
