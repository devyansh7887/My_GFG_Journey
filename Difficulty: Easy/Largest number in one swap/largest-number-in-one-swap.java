class Solution {
    public String largestSwap(String s) {
        char[] digits = s.toCharArray();
        int n = digits.length;

        // Store the last occurrence of each digit (0-9)
        int[] last = new int[10];
        for (int i = 0; i < n; i++) {
            last[digits[i] - '0'] = i;
        }

        // Traverse from left to right
        for (int i = 0; i < n; i++) {
            int current = digits[i] - '0';
            // Try to find a bigger digit to swap with
            for (int d = 9; d > current; d--) {
                if (last[d] > i) {  // rightmost occurrence is after i
                    // Swap current with rightmost bigger digit
                    char temp = digits[i];
                    digits[i] = digits[last[d]];
                    digits[last[d]] = temp;
                    return new String(digits); // return immediately after swap
                }
            }
        }

        // No swap needed (already largest)
        return s;
    }
}
