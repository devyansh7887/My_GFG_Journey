// User function Template for Java

import java.util.*;

class Solution {
    public static ArrayList<ArrayList<Integer>> getPairs(int[] arr) {
        Arrays.sort(arr);
        Set<Integer> set = new HashSet<>();
        TreeSet<ArrayList<Integer>> pairs = new TreeSet<>(new Comparator<ArrayList<Integer>>() {
            public int compare(ArrayList<Integer> a, ArrayList<Integer> b) {
                if (!a.get(0).equals(b.get(0))) {
                    return a.get(0) - b.get(0);
                }
                return a.get(1) - b.get(1);
            }
        });

        for (int num : arr) {
            int target = -num;
            if (set.contains(target)) {
                ArrayList<Integer> pair = new ArrayList<>();
                pair.add(Math.min(num, target));
                pair.add(Math.max(num, target));
                pairs.add(pair);
            }
            set.add(num);
        }

        return new ArrayList<>(pairs);
    }
}
