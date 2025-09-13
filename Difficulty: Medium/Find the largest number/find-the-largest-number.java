class Solution {
    static int find(int N) {
        char[] arr = Integer.toString(N).toCharArray();
        if(arr.length == 1)return N;
        if(isInc(arr)){
            return N;
        }else{
            int i = N - 1;
            while(i>0){
                char[] arr2 = Integer.toString(i).toCharArray();
                if(!isInc(arr2)){
                    i--;
                }else{
                    return i;
                }
            }
        }
        return -1;
    }
    public static boolean isInc(char[] arr){
        boolean result = true;
        for(int i = 0; i<arr.length-1; i++){
            if(arr[i] - '0' <= arr[i+1] - '0')continue;
            else{
                result = false;
            }
        }
        return result;
    }
}