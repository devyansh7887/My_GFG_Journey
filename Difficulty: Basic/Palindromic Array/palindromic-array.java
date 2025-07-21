/*Complete the Function below*/
class Solution {
    public static boolean isPalinArray(int[] arr) {
        for(int isPal : arr){
            if(!isPalin(isPal)){
                return false;
            }
        }
        return true;
    }
    public static boolean isPalin(int n){
        int i = 0;
        int temp = n;
        if (n < 0) return false;
        while(n!=0){
            i= 10*i + n%10;
            n/=10;
        }
        if(temp == i){
            return true;
        }else{
            return false;
        }
    }
}