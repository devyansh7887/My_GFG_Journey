class Solution {
    public int getSecondLargest(int[] arr) {
        //Sort the array in increasing order
        Arrays.sort(arr);
        //Reverse the array to be in decreasing order
        int i = 0, j = arr.length - 1;
        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        // Initialize the max variable that contains the maximum element in the array 
        int max = arr[0];
        int secmax = Integer.MIN_VALUE;
        for(int x = 1; x < arr.length; x++){
            if (max == arr[x]){
                continue;    
            }else{
                secmax = arr[x];
                break;    
            } 
        }
        //HANDLES THE CASE WITH NO SECOND LARGEST ELEMENT(ALL ELEMENTS ARE EQUAL)
        if (secmax == Integer.MIN_VALUE) {
            // No second largest element found
            // You can choose to return -1 or throw exception depending on requirement
            return -1;
        }
        return secmax;
    }
}