// Using the optimised approach - The Reversal Algorithm
class Solution {
    public void rotate(int[] arr) {
        int n = arr.length;
        int d = 1;
        d = d%n;
        reverse(arr,0,n-1);
        reverse(arr,0,d-1);
        reverse(arr,d,n-1);
    }
    public static void reverse(int[] arr, int start, int end){
        while(start< end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}