class Solution {
    public String minWindow(String s1, String s2) {
        int n = s1.length(), m = s2.length();
        String result = "";
        int minLen = Integer.MAX_VALUE;

        int i = 0; // pointer for s1
        int j = 0; // pointer for s2

        while (i < n) {
            // Forward pass: try to match s2 inside s1
            if (s1.charAt(i) == s2.charAt(j)) {
                j++;
                // If we matched entire s2, start backward pass
                if (j == m) {
                    int end = i; // current end of window
                    j--; // move j to last character of s2
                    
                    // Backward pass: shrink window from end to start
                    int k = i;
                    while (j >= 0) {
                        if (s1.charAt(k) == s2.charAt(j)) {
                            j--;
                        }
                        k--;
                    }
                    k++; // k will go one step extra in the loop, fix it
                    
                    // Update result if smaller window found
                    if (end - k + 1 < minLen) {
                        minLen = end - k + 1;
                        result = s1.substring(k, end + 1);
                    }
                    
                    // Reset j to 0 to search for next possible window
                    j = 0;
                    // Move i to k + 1 (next character after start) to search for next candidate
                    i = k;
                }
            }
            i++;
        }
        return result;
    }
}
