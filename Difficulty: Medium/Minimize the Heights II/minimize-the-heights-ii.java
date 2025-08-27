class Solution {
    public int getMinDiff(int[] arr, int k) {
        int n = arr.length;
        Arrays.sort(arr);
        int min, max;
        int diff = arr[n-1] - arr[0];
        for(int i = 1; i<n; i++){
            if(arr[i] - k < 0) continue;
            min = Math.min(arr[0] + k, arr[i] - k);
            max = Math.max(arr[n-1] - k, arr[i-1] + k);
            diff = Math.min(diff, max-min);
        }
        return diff;
    }
}
