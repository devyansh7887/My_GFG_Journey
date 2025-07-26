class Solution {

    void printTriangle(int n) {
        for(int i = n;i>=1;i--){
            for(int j = 'A';j<'A' + i;j++){
                System.out.print((char)j);
            }
            System.out.println();
        }
    }
}