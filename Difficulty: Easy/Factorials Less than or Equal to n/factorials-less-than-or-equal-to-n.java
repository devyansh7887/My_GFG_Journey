// User function Template for Java
class Solution {
    static ArrayList<Long> factorialNumbers(long n) {
        // code here
        ArrayList<Long> result = new ArrayList<>();
        
        long fact = 1;
        long i = 1;
        
        while (fact <= n) {
            result.add(fact);
            i++;
            fact = fact * i;  // compute next factorial
        }
        
        return result;
    }
}