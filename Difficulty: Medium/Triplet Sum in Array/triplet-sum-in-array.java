class Solution {
    public boolean hasTripletSum(int arr[], int target) {
        int n = arr.length;
        Arrays.sort(arr);
        boolean result = false;
        for(int i = 0; i<n-2; i++){
            int j = i + 1, k = n - 1;
            while(i < j && j < k){
                int sum = arr[i] + arr[j] + arr[k];
                if(sum == target) return true;
                else if(sum < target) j++;
                else if(sum > target) k--;
            }
        }
        return false;
    }
}
