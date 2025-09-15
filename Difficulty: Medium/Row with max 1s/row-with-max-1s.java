class Solution {
    public int rowWithMax1s(int arr[][]) {
        int n = arr.length;
        int m = arr[0].length;
        int count = 0;
        int row = -1;
        for(int i = 0; i<n; i++){
            int c = 0; 
            for(int j = 0; j<m; j++){
                if(arr[i][j] == 1) c++;
                if(c > count){
                    count = c;
                    row = i;
                }
            }
        }
        return row;
    }
}