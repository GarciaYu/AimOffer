package Array._003;

public class Solution_Yu {
    public int[] multiply(int[] A) {
        int[] B = new int[A.length];

        for (int i = 0; i < A.length; i++) {
            int mul = 1;
            for (int j = 0;j < A.length;j++){
                if (j != i){
                    mul = mul * A[j];
                }
            }
            B[i] = mul;
        }

        return B;
    }
}
