class Solution {
    public int maxOnes(int arr[], int k) {
        int n = arr.length;
        int left = 0; 
        int maxLength = 0;
        int zeroes = 0;
        for(int right = 0; right < n; right++){
            if(arr[right] == 0) zeroes++;
            while(zeroes > k){
                if(arr[left] == 0) zeroes--;
                left++;
            }
            maxLength = Math.max(maxLength, right - left + 1);
        }
        return maxLength;
    }
}