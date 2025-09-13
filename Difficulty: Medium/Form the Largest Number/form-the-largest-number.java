class Solution {
    public String findLargest(int[] arr) {
        int n = arr.length;
        String[] nums = new String[n];
        for(int i = 0; i < n; i++){
            nums[i] = Integer.toString(arr[i]);
        }
        Arrays.sort(nums, (a,b) -> (b+a).compareTo(a+b));
        if(nums[0].equals("0")) return "0";
        StringBuilder sb = new StringBuilder();
        for(String str : nums){
            sb.append(str);
        }
        return sb.toString();
    }
}