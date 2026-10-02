class Solution {
    public int reverse(int x) {
        long reversed_num = 0;
        while(x!=0){
            long last_digit=x%10;
            reversed_num =(reversed_num*10) + last_digit;
            x=x/10;
            if (reversed_num > Integer.MAX_VALUE ||
                reversed_num < Integer.MIN_VALUE) {
                return 0;
            }
        }
        return (int) (reversed_num);
        
    }
}