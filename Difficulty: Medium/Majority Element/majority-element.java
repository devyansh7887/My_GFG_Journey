class Solution {
    int majorityElement(int arr[]) {
        int n = arr.length;
        int count = 0;
        int maj = 0;
        for(int i = 0; i<n; i++){
            if(arr[i] == arr[maj]){
              count++;
            } 
            else{
                count--;
            }
            if(count<0){
                maj = i;
                count = 1;
            }
        }
        count = 0;
        for (int num : arr) {
            if (num == arr[maj]) {
                count++;
            }
        }

        if(count > n/2) return arr[maj];
        else return -1;
    }
}