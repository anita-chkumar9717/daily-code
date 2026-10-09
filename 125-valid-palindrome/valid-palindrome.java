class Solution {
    public boolean isPalindrome(String s) {
        if(s.length()==1){
            return true;
        }
        char[] a = s.toCharArray();
        String t="";
        for(int i=0; i<a.length; i++){
            if(a[i]>='a' && a[i]<='z' || a[i]>='A' && a[i]<='Z' || a[i]-'0'>=0 && a[i]-'0'<=9){
                t+=a[i];
            }
        }
        t=t.toLowerCase(); 
        System.out.println(t);
        for(int i=0; i<t.length()/2; i++){
            System.out.println(t.charAt(i));
            System.out.println(t.charAt(t.length()-i-1));
            if(t.charAt(i)!=(t.charAt(t.length()-i-1))){
                return false;
            }
        }
        System.out.println(t);
        return true;
    }
}