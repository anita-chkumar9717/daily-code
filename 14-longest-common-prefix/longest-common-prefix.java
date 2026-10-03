class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length==1){
            return strs[0];
        }

        String r="";
        int j=0;
        String temp="";
        for(int i=0; i< strs[0].length(); i++){
            temp=temp + strs[0].charAt(j);
            for(int k=1; k<strs.length; k++){
                if(!strs[k].startsWith(temp)){
                    return r;
                }
                System.out.println("temp:" + temp);
            }
            r=temp;
            j+=1;
            System.out.println(r);
        }
        return r;
    }
}