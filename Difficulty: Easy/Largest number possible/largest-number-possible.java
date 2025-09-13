class Solution {
    static String findLargest(int n, int s) {
        
        if(s == 0 && n == 1) return "0";
        if(s > 9*n) return "-1";
        if(s <= 0) return "-1";
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i<n; i++){
            int d = Math.min(9, s);
            sb.append(d);
            s -= d;
        }
        if(s > 0) return "-1";
        return (sb.toString());
    }
}