class Solution {
    public int findK(int a[][], int n, int m, int k) {
        int left = 0, right = m - 1;
        int top = 0, bottom = n - 1;
        int count = 0;
        while(top <= bottom && left <= right){
            // Left -> Right
            for(int i = left; i<=right; i++){
                count++;
                if(count == k) return (a[top][i]);
            }
            top++;
            // Top -> Bottom
            for(int i = top; i<=bottom; i++){
                count++;
                if(count == k) return(a[i][right]);
            }
            right--;
            // Right -> Left
            if(top <= bottom){
                for(int i = right; i>=left; i--){
                    count++;
                    if(count == k) return(a[bottom][i]);
                }
                bottom--;
            }
            // Bottom -> Top
            if(left <= right){
                for(int i = bottom; i>=top; i--){
                    count++;
                    if(count == k) return(a[i][left]);
                }
                left++;
            }
        }
        return -1;
    }
}