import java.util.Arrays;

class Solution {
    public int thirdMax(int[] N) {
        if (N == null || N.length == 0) {
            return 0; 
        }
        int[] NU = removeDuplicates(N);

        if (NU.length < 3) {
            Arrays.sort(NU);
            return NU[NU.length - 1];
        }

        Arrays.sort(NU);
        return NU[NU.length - 3];
    }

    private int[] removeDuplicates(int[] arr) {
        if (arr == null || arr.length == 0) {
            return new int[0];
        }

        int uniqueCount = 0;
        for (int i = 0; i < arr.length; i++) {
            boolean duplicate = false;
            for (int j = 0; j < uniqueCount; j++) {
                if (arr[i] == arr[j]) {
                    duplicate = true;
                    break;
                }
            }
            if (!duplicate) {
                arr[uniqueCount++] = arr[i];
            }
        }

        int[] result = new int[uniqueCount];
        System.arraycopy(arr, 0, result, 0, uniqueCount);
        return result;
    }
}


  
