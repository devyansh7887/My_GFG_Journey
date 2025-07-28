class Solution {

    void printSquare(int n) {
        for(int i = 0;i<2*n-1;i++){
            for(int j = 0;j<2*n-1;j++){
                int top = i;
                int left = j;
                int right = (2*n-2) -j;
                int down = (2*n-2) -i;
                int x = n-Math.min(Math.min(top,down),Math.min(left,right));
                System.out.print(x + " ");
            }
            System.out.println();
        }
    }
}