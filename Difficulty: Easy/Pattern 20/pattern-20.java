class Solution {
    void printTriangle(int n) {
        for(int x = 1; x<=n; x++){
            for(int a1 = 1; a1<=x; a1++){
                System.out.print("*");
            }
            for(int space = 2*n-2*x; space> 0; space--){
                System.out.print(" ");
            }
            for(int a2 = 1; a2 <= x; a2++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int y = 1; y<n; y++){
            for(int b1 = n-y; b1>=1; b1--){
                System.out.print("*");
            }
            for(int space2 = 1; space2<=2*y; space2++){
                System.out.print(" ");
            }
            for(int b2 = n-y; b2>=1; b2--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}