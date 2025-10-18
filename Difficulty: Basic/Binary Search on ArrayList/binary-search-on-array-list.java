class Solution {
    public static int binarySearchAL(ArrayList<Integer> list, int k) {
        int n = list.size();
        int low = 0, high = n-1;
        while(low <= high){
            int mid = (low + high)/2;
            if(list.get(mid) == k) return mid;
            else if(list.get(mid) > k) high = mid-1;
            else low = mid+1;
        }
        return -1;
    }
}