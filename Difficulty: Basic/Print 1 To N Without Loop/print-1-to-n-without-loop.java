class Solution {
    public void printNos(int n) {
        printnum(1, n);
    }
    public void printnum(int first, int target){
        if (first > target) {
            return;  // Base case: stop recursion
        }
        if(first <= target){
            System.out.print(first + " ");
            // first++; 
        }
        printnum(first + 1,target);
    }
}
