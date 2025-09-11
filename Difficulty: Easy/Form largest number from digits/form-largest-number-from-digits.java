// User function Template for Java

class Solution {

    public String MaxNumber(int arr[]) {
        Arrays.sort(arr);
        for (int i = 0; i < arr.length / 2; i++) {
            int
            
            
            
            
            temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }

        StringBuilder sb = new StringBuilder();
        for(int num:arr){
            sb.append(num);
        }
        String s = sb.toString();
        return s;
    }
}