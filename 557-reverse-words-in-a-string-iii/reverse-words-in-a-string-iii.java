class Solution {
    public String reverseWords(String s) {
        // solution
        int l=0;
        int r=0;
        char[] a= s.toCharArray();

        while(r<a.length){
            if(a[r]==' '){
                rev(a,l,r-1);
                l=r+1;
            }
            r+=1;
        }
        // reverse the last word
        rev(a,l,r-1);
        return new String(a);
    }

    public void rev(char[] a, int l, int r){
        while(l<=r){
            char t=a[r];
            a[r] = a[l];
            a[l] = t;
            l+=1;
            r-=1;
        }
    }
}