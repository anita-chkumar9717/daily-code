class Solution {
    public int strStr(String haystack, String needle) {
        int h=haystack.length();
        int n=needle.length();
        for(int i=0; i<=h-n; i++){
            if(haystack.charAt(i)==needle.charAt(0)){
                String s = haystack.substring(i, i+n);
                if(s.equals(needle)){
                    return i;
                }
            }
        }
        return -1;
        
    }
}