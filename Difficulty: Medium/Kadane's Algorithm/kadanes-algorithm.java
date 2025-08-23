class Solution {
    int maxSubarraySum(int[] arr) {
        // MAXIMUM SUBARRAY SUM - USING KADANE'S ALGORITHM
        int n = arr.length;
        if(n == 1){
            return arr[0];
        }
        int max = arr[0];
        int sum = arr[0];
        for(int i = 1; i<n; i++){
            sum = Math.max(arr[i], arr[i] + sum);
            max = Math.max(sum, max);
        }
        return max;
    }
}
