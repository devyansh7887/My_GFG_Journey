class Solution {
    static ArrayList<Integer> subarraySum(int[] arr, int target) {
        // USING HASHMAP AND PREFIX SUM
        int n = arr.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);
        ArrayList<Integer> list = new ArrayList<>();
        int left = -1, right = -1;
        int prefixSum = 0;
        for(int i = 0; i<n; i++){
            prefixSum += arr[i];
            if(map.containsKey(prefixSum - target)){
                left = map.get(prefixSum - target) + 2;
                right = i + 1;
                break;
            }
            if (!map.containsKey(prefixSum)) {
                map.put(prefixSum, i);
            }
        }
        if(left == -1 && right == -1){
            list.add(-1);
        }else{
            list.add(left);
            list.add(right);
        }
        return list;
    }
}
