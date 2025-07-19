class Solution {

    void printTriangle(int n) {
        for(int i = 0;i<n;i++){
            for(int s = 0;s<i;s++){
                System.out.print(" ");
            }
            for(int j =1;j<=(2*n) - (2*i) -1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        
    }
}