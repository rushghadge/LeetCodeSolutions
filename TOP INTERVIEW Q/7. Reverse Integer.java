class Solution {
    public int reverse(int x) {
        int res=0;
      //  System.out.println("hi:"+2/10);
        while(x!=0){
            //mod (%) returns reminder 123 % 10 = 3 ; div 123/10 = 12 
            int lastDigit = x%10; 
            x = x/10;
            //constraints 
            // max int = 21 . . . . . 6 4  7 (10 digits)
            //min int = -21 . . . . . 6 4  8
if(res > Integer.MAX_VALUE /10 || 
   ( res == Integer.MAX_VALUE / 10 && lastDigit > Integer.MAX_VALUE % 10)) return 0;
if(res < Integer.MIN_VALUE/10 || (res == Integer.MIN_VALUE / 10 && lastDigit < Integer.MIN_VALUE % 10)) return 0;
            
            res = (res*10)+lastDigit;
            
        }
            return res;
    }
}