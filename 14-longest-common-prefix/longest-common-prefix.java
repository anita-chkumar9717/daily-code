class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length==1 || strs==null){
            return strs[0];
        }

        String pref=strs[0];

        for(int i=1; i<strs.length; i++){
            while(!strs[i].startsWith(pref)){
                pref=pref.substring(0,pref.length() -1);
                if(pref.isEmpty()){
                    return "";
                }
            }
        }

        return pref;
    }
}
