class Solution {
    public int missingNumber(int[] arr) {
        // BRUTE FORCE -> Using a HashSet, to iterate throught the array and keep track of the numbers
        // T(O) -> O(n); S(O) -> O(n), use extra space
        // BETTER APPROACH -> Using a Sorting approach, where first sort and then iteratively find the missing number
        // T(O) -> O(nLOGn); S(O) -> O(1), EXTRA TIME COMPLEXITY
        // OPTIMAL APPROACH
        int n = arr.length;
        // Replace non-positive and out of range numbers with n+1
        for (int i = 0; i < n; i++) {
            if(arr[i] <= 0 || arr[i] > n) {
                arr[i] = n + 1;
            }
        }

        
        for(int i = 0; i<n; i++){
            int val = Math.abs(arr[i]);
            if(val >= 1 && val <= n){
                int pos = val - 1;
                if(arr[pos] > 0){
                    arr[pos] = -arr[pos];
                }
            }
        }
        for(int i = 0; i<n; i++){
            if(arr[i] > 0){
                return i+1;
            }
        }
        return n+1;
    }
}
