class Solution {

    void printTriangle(int n) {
        for(int i = 1;i <= n;i++){
            for(int j = 0;j < i;j++){
                System.out.print((char)('A' + n-1-j) + " ");
            }
            System.out.println();
        }
    }
}