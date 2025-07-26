class Solution {
    void printTriangle(int n) {
        for(int i = 1;i <= n;i++){
            for(int j = 'A';j<'A' + i;j++){
                System.out.print((char)j);
            }
            System.out.println();
        }
    }
}