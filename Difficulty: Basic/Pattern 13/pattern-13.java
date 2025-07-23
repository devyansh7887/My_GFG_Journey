//Back-end complete function Template for Java

class Solution {
    void printTriangle(int n) {
        int num = 1;
        for(int i = 1;i<=n;i++){
            for(int j = i;j<2*i;j++){
                System.out.print(num + " ");
                num++;
            }
            System.out.println();
        }
    }
}