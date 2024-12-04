class Solution {
    public int findContentChildren(int[] G, int[] S) {
        bubbleSort(G);
        bubbleSort(S);
        int довольныеДети = 0;
        int i = 0;
        int j = 0;

        while (i < G.length && j < S.length) {
            if (S[j] >= G[i]) {
                довольныеДети++;
                i++;
                j++;
            } else {
                j++;
            }
        }

        return довольныеДети;
    }

    private void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}
