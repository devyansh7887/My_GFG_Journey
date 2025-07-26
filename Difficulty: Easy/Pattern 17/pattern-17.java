class Solution {

    void printTriangle(int n) {
        for(int i = 1; i<=n; i++){
            //for spaces
            for(int spaces = n-i; spaces > 0; spaces--){
                System.out.print(" ");
            }
            //for alphabet-first
            for(int j = 'A';j<='A' + i - 1; j++){
                System.out.print((char)j);
            }
            //for aphabet-second
            for(int k = 'A'+i-2;k>='A';k--){
                System.out.print((char)k);
            }
            System.out.println();
        }
    }
}