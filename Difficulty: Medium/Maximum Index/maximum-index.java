class Solution {
    int maxIndexDiff(int[] arr) {
        int n = arr.length;
        if (n == 0) return 0; // or -1 depending on convention

        // Build LMin[] (minimum from left up to i)
        int[] LMin = new int[n];
        LMin[0] = arr[0];
        for (int i = 1; i < n; i++) {
            LMin[i] = Math.min(arr[i], LMin[i - 1]);
        }

        // Build RMax[] (maximum from right from j to end)
        int[] RMax = new int[n];
        RMax[n - 1] = arr[n - 1];
        for (int j = n - 2; j >= 0; j--) {
            RMax[j] = Math.max(arr[j], RMax[j + 1]);
        }

        // Two-pointer traversal on LMin and RMax
        int i = 0, j = 0, maxDiff = 0;
        while (i < n && j < n) {
            if (LMin[i] <= RMax[j]) {
                maxDiff = Math.max(maxDiff, j - i);
                j++;
            } else {
                i++;
            }
        }

        return maxDiff;
    }
}

