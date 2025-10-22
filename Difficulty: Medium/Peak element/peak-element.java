class Solution {
    public int peakElement(int[] arr) {
        int n = arr.length;
        if(n==1) return 0; 
        int result = -1;
        for(int i = 0; i<n; i++){
            if(i == 0){
                if(arr[i] > arr[i+1]){
                    result = i;
                    break;
                } 
            }else if(i == n-1){
                if(arr[i] > arr[i-1]){
                    result = i;
                    break;
                } 
            }else if(arr[i] > arr[i-1] && arr[i] > arr[i+1]){
                result = i;
                break;
            }
        }
        return result;
    }
}//