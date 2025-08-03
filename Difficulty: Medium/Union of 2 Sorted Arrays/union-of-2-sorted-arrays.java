class Solution {
    public static ArrayList<Integer> findUnion(int a[], int b[]) {
        int i = 0, j = 0;
        int c1 = a.length, c2 = b.length;
        Integer last = null; //must be Integer as int can not take null as a value
        ArrayList<Integer> list = new ArrayList<>();
        while(i < c1 && j < c2){
            //skipping duplicates from a[]
            while(i < c1 && i > 0 && a[i] == a[i-1]) i++;
            //skipping duplicates from b[]
            while(j < c2 && j > 0 && b[j] == b[j-1]) j++;
            if(i>=c1 || j>=c2) break;
            if(a[i] == b[j]){
                if(last == null || !last.equals(a[i])){
                    list.add(a[i]);
                    last = a[i];
                }
                i++;
                j++;
            }else if(a[i] < b[j]){
                if(last == null || !last.equals(a[i])){
                    list.add(a[i]);
                    last = a[i];
                }
                i++;
            }else{
                //a[i] > b[j]
                if(last == null || !last.equals(b[j])){
                    list.add(b[j]);
                    last = b[j];
                }
                j++;
            }
        }
        //Entering the rest elements of a[] 
        while(i < c1){
            if((i == 0 || a[i] != a[i-1])&&(last == null || !last.equals(a[i]))){
                list.add(a[i]);
                last = a[i];
            }
            i++;
        }
        //Entering the rest elements of b[]
        while(j < c2){
            if((j == 0 || b[j] != b[j-1])&&(last == null || !last.equals(b[j]))){
                list.add(b[j]);
                last = b[j];
            }
            j++;
        }
        return list;
    }
}
