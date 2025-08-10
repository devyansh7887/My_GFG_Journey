class Solution {
    public boolean isSorted(int[] arr) {
        // int i = 0;
        int count = 0;
        for(int i = 0;i<arr.length-1;i++){
            if(arr[i]<=arr[i+1]){
                count++;
                // i++;
            }    
        }
        if(count == arr.length-1){
            return true;
        }
        else{
            return false;
        }
    }
}
//hjwfnik