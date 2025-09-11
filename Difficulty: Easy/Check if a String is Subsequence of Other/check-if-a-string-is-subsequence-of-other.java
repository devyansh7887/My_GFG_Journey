class Solution {
    public boolean isSubSeq(String s1, String s2) {
        int ns1 = s1.length();
        int ns2 = s2.length();
        int i = 0, j = 0;
        while(i<ns1 && j<ns2){
            if(s1.charAt(i) == s2.charAt(j)){
                i++;
            }
            j++;
        }
        return i == ns1;
    }
};