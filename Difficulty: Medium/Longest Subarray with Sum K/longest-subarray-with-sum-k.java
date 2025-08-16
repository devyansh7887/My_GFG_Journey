// User function Template for Java

class Solution {
    public int longestSubarray(int[] arr, int k) {
        // <-------BRUTE FORCE METHOD---------->
        // NESTED LOOPS
        // <----------BETTER APPROACH----------->
        // PREFIX SUM USING HASHING
        // <----------OPTIMISED APPROACH---------->
        // USING SLIDING WINDOW / TWO POINTERS
        // code here
        Map<Integer, Integer> prefixSumIndices = new HashMap<>();
        int maxLength = 0;
        int prefixSum = 0;
        prefixSumIndices.put(0, -1); // to handle subarrays starting at index 0
        for (int i = 0; i < arr.length; i++) {
            prefixSum += arr[i];
            // Check if there exists a prefix sum that when subtracted gives sum = k
            if (prefixSumIndices.containsKey(prefixSum - k)) {
                int startIndex = prefixSumIndices.get(prefixSum - k);
                maxLength = Math.max(maxLength, i - startIndex);
            }
            // Store the earliest occurrence of this prefix sum
            prefixSumIndices.putIfAbsent(prefixSum, i);
        }
        return maxLength;
    }
}