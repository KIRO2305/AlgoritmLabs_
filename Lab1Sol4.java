import java.util.Arrays;

class Solution {
    public int largestPerimeter(int[] N) {
        Arrays.sort(N);
        for (int i = N.length - 3; i >= 0; i--) {
            if (N[i] + N[i + 1] > N[i + 2]) {
                return N[i] + N[i + 1] + N[i + 2];
            }
        }
        return 0;
    }
}
