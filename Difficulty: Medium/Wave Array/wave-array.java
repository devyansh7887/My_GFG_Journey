class Solution {
    public void sortInWave(int arr[]) {
        int n = arr.length;
        int i = 0, j = 1;
        while(i<n-1 && j<n){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i += 2;
            j += 2;
        }
    }
}
