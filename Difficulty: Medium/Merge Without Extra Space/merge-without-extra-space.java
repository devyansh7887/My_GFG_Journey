class Solution {
    public void mergeArrays(int a[], int b[]) {
        int[] arr = new int[a.length + b.length];
        int l3 = arr.length;
        for(int i = 0; i<a.length; i++){
            arr[i] = a[i];
        }
        for(int j = 0; j<b.length; j++){
            arr[l3 - b.length + j] = b[j];
        }
        //now we have a new array arr that is unsorted and combination of elements of both arrays
        Arrays.sort(arr);
        for(int x = 0; x<a.length; x++){
            a[x] = arr[x];
        }
        for(int y = 0; y<b.length; y++){
            b[y] = arr[l3 - b.length + y];
        }
    }
}
