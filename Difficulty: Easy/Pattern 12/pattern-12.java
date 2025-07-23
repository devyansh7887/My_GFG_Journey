class Solution {

    void printTriangle(int n) {
        for(int i = 1;i<=n;i++){
            //number
            for(int a = 1;a<=i;a++){
                System.out.print(a + " ");
            }
            //space
            int spaces = 2*n-2*i;
            for(int space = 1;space<=spaces;space++){
                System.out.print("  ");
            }
            //number
            for(int b = i;b>=1;b--){
                System.out.print(b + " ");
            }
            System.out.println();
        }
    }
}