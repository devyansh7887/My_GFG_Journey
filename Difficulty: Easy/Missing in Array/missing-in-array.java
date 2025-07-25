class Solution {
    int missingNum(int arr[]) {
        int sum = 0;
        int n = arr.length + 1;
        for(int i = 1;i<=n;i++){
            sum += i;
        }
        int sum2 = 0;
        for(int j = 0;j<arr.length;j++){
            sum2 += arr[j];
        }
        return sum - sum2;
    }
}