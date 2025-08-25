class Solution {
    static int minJumps(int[] arr) {
        int n = arr.length;
        if (n <= 1) return 0;  // No jumps needed if array size is 1

        int jumps = 1;           // Start with 1 jump at least
        int farthest = arr[0];   // Farthest reachable index so far
        int currEnd = arr[0];    // End of the current jump range

        if (arr[0] == 0) return -1; // Cannot move anywhere from the first element

        for (int i = 1; i < n - 1; i++) {
            farthest = Math.max(farthest, i + arr[i]);
            if (i > farthest) {
                // Cannot reach this position, so can't reach the end
                return -1;
            }
            if (i == currEnd) {
                jumps++;
                currEnd = farthest;
                if (currEnd >= n - 1) {
                    break;  // End is reachable, stop early
                }
            }
        }

        return currEnd >= n - 1 ? jumps : -1;
    }
}
