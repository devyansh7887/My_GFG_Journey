class Solution {
    void printDiamond(int n) {
        for(int i = 1;i<=n;i++){
            for(int space = 1;space <=n-i;space++){
                System.out.print(" "); 
            }
            for(int star = 1;star <=i;star++){
                System.out.print("* ");
            }
            System.out.println();
        }
        
        for(int j = n;j>=1;j--){
            for(int space2 = 1;space2<=n-j;space2++){
                System.out.print(" ");
            }
            for(int star2 = 1;star2<=j;star2++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
