class Solution {
    public boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }
        double y=0;
        double q=(double)x;
        while(x!=0){
            y = (y*10) + (x%10);
            x=x/10;
        }
        

        return y==q;
        
    }
}