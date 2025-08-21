class Solution {
    public void segregateElements(int[] arr) {
        int n = arr.length;
        int[] nums = new int[n];
        int k =0;
        for(int i = 0; i<n; i++){
            if(arr[i] >= 0){
                nums[k++] = arr[i];
            }
        }
        for(int i = 0; i<n; i++){
            if(arr[i] < 0){
                nums[k++] = arr[i];
            }
        }
        for(int i = 0; i<n; i++){
            arr[i] = nums[i];
        }
    }
}