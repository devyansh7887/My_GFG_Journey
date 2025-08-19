class Solution {
    int maxLength(int arr[]) {
        // Same as the Problem with Subarray with sum K
        // <-----------OPTIMAL APPROACH SOLUTION---------->
        // Using HashMap and PrefixSum
        HashMap<Integer, Integer> map = new HashMap<>();
        int n = arr.length;
        int maxLength = 0, prefixSum = 0;
        map.put(0,-1);
        for(int i = 0; i<n; i++){
            prefixSum += arr[i];
            if(map.containsKey(prefixSum)){
                int temp = map.get(prefixSum);
                maxLength = Math.max(maxLength, i - temp);
            }
            map.putIfAbsent(prefixSum, i);
        }
        return maxLength;
    }
}