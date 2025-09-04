class Solution {
    public boolean checkDuplicates(int arr[]) {
        int n = arr.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i<n; i++){
            if(!map.containsKey(arr[i])) map.put(arr[i], i);
            else return true;
        }
        return false;
    }
}