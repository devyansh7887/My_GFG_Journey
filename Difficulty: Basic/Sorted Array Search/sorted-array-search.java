class Solution {
    static boolean searchInSorted(int arr[], int k) {
        int n = arr.length;
        int count =0;
        for(int i = 0; i<n; i++){
            if(k == arr[i]) break; 
            count++;
        }
        if(count == n)return false;
        return true;
    }
}