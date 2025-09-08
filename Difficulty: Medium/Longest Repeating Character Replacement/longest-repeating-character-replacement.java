class Solution {
    static int characterReplacement(String s, int k) {
        int n = s.length();
        int[] fre = new int[26];
        int left = 0, maxfre = 0, maxLen = 0;
        for(int right = 0; right < n; right++){
            fre[s.charAt(right) - 'A']++;
            maxfre = Math.max(maxfre, fre[s.charAt(right) - 'A']);
            while((right - left + 1) - maxfre > k){
                fre[s.charAt(left) - 'A']--;
                left++;
            }
            maxLen = Math.max(maxLen, (right-left+1));
        }
        return maxLen;
    }
}
