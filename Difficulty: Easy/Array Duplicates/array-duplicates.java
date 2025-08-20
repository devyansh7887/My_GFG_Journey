import java.util.ArrayList;
import java.util.HashSet;

class Solution {
    public ArrayList<Integer> findDuplicates(int[] arr) {
        HashSet<Integer> seen = new HashSet<>();
        HashSet<Integer> duplicates = new HashSet<>();
        
        for (int num : arr) {
            if (seen.contains(num)) {
                duplicates.add(num);
            } else {
                seen.add(num);
            }
        }
        
        return new ArrayList<>(duplicates);
    }
}
