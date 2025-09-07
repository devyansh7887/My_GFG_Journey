class Solution {
    public int maxWater(int arr[]) {
        int n = arr.length;
        int maxArea = 0;
        int left = 0;
        int right = n - 1;
        while(left < right){
            int area = Math.min(arr[left], arr[right]) * (right - left);
            maxArea = Math.max(maxArea, area);
            if(arr[left] < arr[right]){
                left++;
            }else{
                right--;
            }
        }
        return maxArea;
    }
}