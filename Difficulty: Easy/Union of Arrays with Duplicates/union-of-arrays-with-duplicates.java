class Solution {
    public static ArrayList<Integer> findUnion(int[] a, int[] b) {
        int n1 = a.length;
        int n2 = b.length;
        // ArrayList<Integer> list = new ArrayList<>();
        // <--------- O(n^2) Approach ----------->
        // for(int i = 0; i<n1; i++){
        //     if(!list.contains(a[i])){
        //         list.add(a[i]);
        //     }
        // }
        // for(int i = 0; i<n2; i++){
        //     if(!list.contains(b[i])){
        //         list.add(b[i]);
        //     }
        // }
        // return list;
        // <----------TWO POINTER APPROACH----------->
        int i = 0, j = 0;
        HashSet<Integer> set = new HashSet<>();
        while(i<n1 && j<n2){
            if(a[i] == b[j] && !set.contains(a[i])) set.add(a[i]);
            else if(!set.contains(a[i]) && !set.contains(b[j])){
                set.add(a[i]);
                set.add(b[j]);
            }else if(!set.contains(a[i])){
                set.add(a[i]);
            }else if(!set.contains(b[j])){
                set.add(b[j]);
            }
            i++;
            j++;
        }
        while(i<n1){
            if(!set.contains(a[i])) set.add(a[i]);
            i++;
        }
        while(j<n2){
            if(!set.contains(b[j])) set.add(b[j]);
            j++;
        }
        return new ArrayList<>(set);
    }
}