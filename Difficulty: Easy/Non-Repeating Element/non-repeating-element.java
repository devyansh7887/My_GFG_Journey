class Solution {
    public int firstNonRepeating(int[] arr) {
        int n = arr.length;
        int unique = 0;
        int count = 1;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i<n; i++){
            if(!map.containsKey(arr[i])){
                count = 1;
                map.put(arr[i], count);
            }else{
                count = map.get(arr[i]) + 1;
                map.put(arr[i], count);
            }
        }
        for(int i = 0; i<n; i++){
            if(map.get(arr[i]) == 1){
                unique = arr[i];
                break;
            }
        }
        return unique;
    }
}
