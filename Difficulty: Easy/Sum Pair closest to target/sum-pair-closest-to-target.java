class Solution {
    public ArrayList<Integer> sumClosest(int[] arr, int target) {
        // TWO POINTER APPROACH
        int n = arr.length;
        ArrayList<Integer> result = new ArrayList<>();
        Arrays.sort(arr);
        
        if(n < 2){
            return result;
        }
        
        int left = 0, right = n-1;
        int minDiff = Integer.MAX_VALUE;
        int diffEle = -1;
        int a = -1, b = -1;
        
        while(left<right){
            int sum = arr[left] + arr[right];
            int diff = Math.abs(target - sum);
            if(diff<minDiff){
                minDiff = diff;
                diffEle = arr[right] - arr[left];
                a = arr[left];
                b = arr[right];
            }else if(diff == minDiff){
                int currdiff = arr[right] - arr[left];
                if(currdiff > diffEle){
                    diffEle = currdiff;
                    a = arr[left];
                    b = arr[right];
                }
            }
            if(sum<target){
                left++;
            }else{
                right--;
            }
        }
        if (a == -1 && b == -1) {
            return result;  // empty array if no pair found
        }
        
        result.add(a);
        result.add(b);
        return result;
    }
}