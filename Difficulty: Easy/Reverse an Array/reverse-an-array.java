class Solution {
    public void reverseArray(int arr[]) {
        int temp = 0;
        for(int i = 0;i<arr.length/2;i++){
            temp = arr[i];
            arr[i] = arr[arr.length-1-i];
            arr[arr.length-1-i] = temp;
        }
    }
}