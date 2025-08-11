// User function Template for Java
class Solution {
    static boolean armstrongNumber(int n) {
        int x = 0;
        int y = 0;
        int temp = n;
        while(temp!=0){
            x = temp%10;
            y += Math.pow(x, 3);
            temp /= 10;
        }
        if(n<0){
            return false;
        }else if(y == n){
            return true;
        }else{
            return false;
        }
    }
    //
}