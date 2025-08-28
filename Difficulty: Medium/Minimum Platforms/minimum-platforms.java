class Solution {
    public int findPlatform(int arr[], int dep[]) {
        int n = arr.length;
        int platforms = 0;
        int maxPlatforms = 0;
        Arrays.sort(arr);
        Arrays.sort(dep);
        int i = 0, j = 0;
        while(i<n && j<n){
            // A Train Arrives before the earliest departure
            if(arr[i] <= dep[j]){
                platforms++;
                maxPlatforms = Math.max(platforms, maxPlatforms);
                i++;
            }else{
                // A Train departs freeing one platform
                platforms--;
                j++;
            }
        }
        return maxPlatforms;
    }
}
