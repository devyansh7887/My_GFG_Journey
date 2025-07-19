
class Solution {
    public static boolean isPerfect(int[] arr) {
        int[] arr2 = new int[arr.length];
        int n = 0;
        for(int i = arr.length-1;i>=0;i--){
            arr2[n] = arr[i];
            n++;
        }
        if(Arrays.equals(arr,arr2)){
            return true;
        }else{
            return false;
        }
    }
}
