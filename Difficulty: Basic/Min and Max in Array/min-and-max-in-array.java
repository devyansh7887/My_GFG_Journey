class Solution {
    public Pair<Integer, Integer> getMinMax(int[] arr) {
        int a = 0;
        int min = arr[a];
        for(int i =0;i<arr.length;i++){
            if(arr[i]<min){
                min = arr[i];
            }
        }
        int max = arr[a];
        for(int j = 0;j<arr.length;j++){
            if(arr[j]>max){
                max = arr[j];
            }
        }
        return new Pair<>(min, max);
    }
}
