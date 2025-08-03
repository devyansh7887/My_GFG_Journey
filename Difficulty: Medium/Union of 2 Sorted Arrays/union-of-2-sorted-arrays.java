import java.util.ArrayList;

class Solution {
    public static ArrayList<Integer> findUnion(int a[], int b[]) {
        int i = 0, j = 0; //Initialising two variables tp iterate
        int n = a.length, m = b.length;
        ArrayList<Integer> result = new ArrayList<>();
        Integer lastAdded = null;
        while (i < n && j < m) {
            // Skip duplicates in a
            while (i > 0 && i < n && a[i] == a[i - 1]) {
                i++;
            }
            // Skip duplicates in b
            while (j > 0 && j < m && b[j] == b[j - 1]) {
                j++;
            }
            if (i >= n || j >= m) {
                break;
            }

            if (a[i] < b[j]) {
                if (lastAdded == null || !lastAdded.equals(a[i])) {
                    result.add(a[i]);
                    lastAdded = a[i];
                }
                i++;
            } else if (b[j] < a[i]) {
                if (lastAdded == null || !lastAdded.equals(b[j])) {
                    result.add(b[j]);
                    lastAdded = b[j];
                }
                j++;
            } else { // a[i] == b[j]
                if (lastAdded == null || !lastAdded.equals(a[i])) {
                    result.add(a[i]);
                    lastAdded = a[i];
                }
                i++;
                j++;
            }
        }

        // Add remaining elements of a
        while (i < n) {
            if ((i == 0 || a[i] != a[i - 1]) && (lastAdded == null || !lastAdded.equals(a[i]))) {
                result.add(a[i]);
                lastAdded = a[i];
            }
            i++;
        }

        // Add remaining elements of b
        while (j < m) {
            if ((j == 0 || b[j] != b[j - 1]) && (lastAdded == null || !lastAdded.equals(b[j]))) {
                result.add(b[j]);
                lastAdded = b[j];
            }
            j++;
        }

        return result;
    }
}
