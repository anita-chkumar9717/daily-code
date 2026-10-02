class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }

        int[] counts = new int[26];

        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            char d = t.charAt(i);

            if(c>='a' && c<='z'){
                counts[c-'a']+=1;
                counts[d-'a']-=1;
            }
        }
        
        for(int i=0; i<26; i++){
            if(counts[i]!=0 ){
                return false;
            }
        }
        return true;
        
    }
    
}