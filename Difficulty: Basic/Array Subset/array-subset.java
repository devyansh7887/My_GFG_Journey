import java.util.Arrays;

class Solution {
    public boolean isSubset(int a[], int b[]) {
        Arrays.sort(a);
        Arrays.sort(b);

        int i = 0; // Pointer for a[]
        int j = 0; // Pointer for b[]

        while (i < a.length && j < b.length) {
            if (a[i] < b[j]) {
                i++;
            } else if (a[i] == b[j]) {
                i++;
                j++;
            } else {
                // b[j] not found in a[]
                return false;
            }
        }

        // If all elements of b[] were matched
        return j == b.length;
    }
}
