class Solution {
    public List<Integer> frequencyCount(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int  n = arr.length;
        for(int num : arr){
            map.put(num, map.getOrDefault(num,0)+1);
        }
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 1; i<=n; i++){
            list.add(map.getOrDefault(i,0));
        }
        return list;
    }
}
