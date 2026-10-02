class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }

        int[] counts = new int[26];

        for(int i=0; i<s.length(); i++){
            counts[s.charAt(i) -'a']+=1;
            counts[t.charAt(i) -'a']-=1;
        }
        
        for(int i=0; i<26; i++){
            if(counts[i]!=0 ){
                return false;
            }
        }
        return true;
        
    }
    
}