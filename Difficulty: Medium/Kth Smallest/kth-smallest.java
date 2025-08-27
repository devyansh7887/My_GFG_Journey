class Solution {
    public static int kthSmallest(int[] arr, int k) {
        int n = arr.length;
        ArrayList<Integer> list = new ArrayList<>();
        for (int num : arr) {
            // Find the correct position to insert
            int idx = 0;
            while (idx < list.size() && list.get(idx) < num) {
                idx++;
            }
            list.add(idx, num);
        }
        return list.get(k-1);
    }
}
