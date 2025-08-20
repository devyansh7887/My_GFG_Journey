import java.util.ArrayList;

class Solution {
    void rearrange(ArrayList<Integer> arr) {
        ArrayList<Integer> positives = new ArrayList<>();
        ArrayList<Integer> negatives = new ArrayList<>();

        // Separate positive (and zero) and negative numbers while maintaining order
        for (int num : arr) {
            if (num >= 0) {
                positives.add(num);
            } else {
                negatives.add(num);
            }
        }

        int i = 0, p = 0, n = 0;
        int sizePos = positives.size();
        int sizeNeg = negatives.size();

        // Reconstruct arr with alternating positive and negative starting with positive
        while (p < sizePos && n < sizeNeg) {
            if (i % 2 == 0) {
                arr.set(i, positives.get(p++));
            } else {
                arr.set(i, negatives.get(n++));
            }
            i++;
        }

        // If positives remain, append them in order
        while (p < sizePos) {
            arr.set(i++, positives.get(p++));
        }

        // If negatives remain, append them in order
        while (n < sizeNeg) {
            arr.set(i++, negatives.get(n++));
        }
    }
}
