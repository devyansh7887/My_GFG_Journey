class Solution {

    void printTriangle(int n) {
        for(int i = 1;i<=n;i++){
            for(int j = 0; j < i; j++){
                System.out.print((char)('A'+i-1));
            }
            System.out.println();
        }
    }
}