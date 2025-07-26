class Solution {
    void printTriangle(int n) {
        for(int x = 1; x<=n; x++){
            //first set of stars
            for(int a1 = n-x+1; a1>=1; a1--){
                System.out.print("*");
            }
            //for spaces
            for(int space1 = 0; space1 < 2*x-2; space1++){
                System.out.print(" ");
            }
            //second set of spaces
            for(int a2 = n-x+1; a2>=1;a2--){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int y = 1; y<=n; y++){
            //first set of stars
            for(int b1 = 1; b1 <= y; b1++){
                System.out.print("*");
            }
            //for spaces
            for(int space2 = 2*n-2*y; space2>0; space2--){
                System.out.print(" ");
            }
            //second set of spaces
            for(int b2 = 1; b2<=y; b2++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}