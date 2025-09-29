class Solution {
    static String largestNumber(int n, int sum) {
        // Edge case: sum too large or too small
        if (sum > 9 * n) return "-1"; // can't distribute sum into n digits
        if (sum < 0) return "-1";

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n; i++) {
            // max digit we can place here
            int d = Math.min(9, sum);
            sb.append(d);
            sum -= d;
        }

        // If after filling all digits, sum is not 0, then it's impossible
        if (sum > 0) return "-1";

        return sb.toString();
    }
}//
//