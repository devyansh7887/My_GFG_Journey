class Solution {
    public static int firstRepeated(int[] arr) {
        // <----------USING HASHMAP----------->
        int n = arr.length;
        int first = Integer.MAX_VALUE;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0; i<n; i++){
            if(map.containsKey(arr[i])){
                int temp = map.get(arr[i]);
                first = Math.min(first,temp);
                map.put(arr[i], i);
            }else{
                map.put(arr[i], i);
            }
        }
        if(first == Integer.MAX_VALUE){
            return -1;
        }else{
            return first + 1;
        }
    }
}
