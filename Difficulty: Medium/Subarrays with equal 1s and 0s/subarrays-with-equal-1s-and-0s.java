class Solution {
    public int countSubarray(int[] arr) {
        // PREFIX SUM + HASHMAP
        // If we convert every 0 to -1, then we are looking for subarrays with sum = 0.
        int n = arr.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        int prefix_sum = 0;
        int count = 0;
        map.put(0, 1);
        for(int i = 0; i<n; i++){
            int val = (arr[i] == 0)? -1:1;
            prefix_sum += val;
            // If prefix sum seen before, subarray with sum 0 exists
            if(map.containsKey(prefix_sum)){
                count += map.get(prefix_sum);
            }
            map.put(prefix_sum, map.getOrDefault(prefix_sum, 0) + 1);
        }
        return count;
    }
}