class Solution {
    String maxNumber;

    // Function to find the largest number after k swaps.
    public String findMaximumNum(String s, int k) {
        maxNumber = s;
        char[] arr = s.toCharArray();
        helper(arr, k, 0);
        return maxNumber;
    }

    private void helper(char[] arr, int k, int index) {
        if (k == 0 || index >= arr.length) return;

        // Find max digit from index onwards
        char maxDigit = arr[index];
        for (int i = index + 1; i < arr.length; i++) {
            if (arr[i] > maxDigit) maxDigit = arr[i];
        }

        if (maxDigit != arr[index]) k--; // one swap will be used

        // Try swapping with all occurrences of maxDigit (rightmost first)
        for (int i = arr.length - 1; i >= index; i--) {
            if (arr[i] == maxDigit) {
                swap(arr, index, i);

                String current = new String(arr);
                if (current.compareTo(maxNumber) > 0) {
                    maxNumber = current;
                }

                helper(arr, k, index + 1);

                swap(arr, index, i); // backtrack
            }
        }
    }

    private void swap(char[] arr, int i, int j) {
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
