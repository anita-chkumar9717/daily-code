class Solution {
    public String reverseVowels(String s) {
        char [] rev = s.toCharArray();

        String v = "aAeEiIoOuU";
        int r=s.length()-1;
        int l=0;
        while(l<r){
            while(l<r && v.indexOf(rev[l]) == -1){
                l+=1;
            }
            while(l<r && v.indexOf(rev[r]) == -1){
                r-=1;
            }

            if (l < r) {
                char c=rev[l];
                rev[l]=rev[r];
                rev[r]=c;
                l+=1;
                r-=1;
            }
            
        }

        return new String(rev);
        
        
    }
}