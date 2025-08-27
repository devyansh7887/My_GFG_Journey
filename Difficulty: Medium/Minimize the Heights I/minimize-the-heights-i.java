class Solution {
    public int getMinDiff(int[] arr, int k) {
        int n = arr.length;
        if(n==1) return 0;
        int min, max;
        Arrays.sort(arr);
        int diff = arr[n-1] - arr[0];
        for(int i = 1; i<n; i++){
            min = Math.min(arr[0] + k, arr[i] - k);
            max = Math.max(arr[n-1] - k, arr[i-1] + k);
            diff = Math.min(diff, max-min);
        }
        return diff;
    }
}