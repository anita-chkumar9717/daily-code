class Solution {
    public boolean isAnagram(String s, String t) {

        if(s.length() != t.length()){
            return false;
        }

        char [] s_sorted = s.toCharArray();
        Arrays.sort(s_sorted);

        char [] t_sorted = t.toCharArray();
        Arrays.sort(t_sorted);

        for(int i=0; i< s.length(); i++){
            if(s_sorted[i]!=t_sorted[i]){
                return false;
            }
        }
        return true;
        
    }
    
}