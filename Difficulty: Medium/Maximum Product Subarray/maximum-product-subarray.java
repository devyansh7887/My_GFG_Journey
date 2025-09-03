class Solution {
    int maxProduct(int[] arr) {
        int n = arr.length;
        int maxP = Integer.MIN_VALUE;
        int pre = 1, suf = 1;
        for(int i = 0; i<n; i++){
            if(pre == 0) pre = 1;
            if(suf == 0) suf = 1;
            pre *= arr[i];
            suf *= arr[n-i-1];
            maxP = Math.max(maxP, Math.max(pre, suf));
        }
        return maxP;
    }
}