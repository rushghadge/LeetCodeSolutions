class Solution {
    public int countSubstrings(String s) {
       int len = s.length();
        int res=0;
        // iterate through all chars in string
        for(int i=0; i<len; ++i){
            //for odd len strings aba (considering i in position of b, we move pointers l, h to next to chars and check for palindrome)
           res+= paliCheck(s,i,i); // odd check
            System.out.println("OP odd check incremeted : "+res);
           res+=  paliCheck(s,i,i+1); // Even check bb ( i=0 first occurance of b,i=1 > second occuranceof b)
                   System.out.println("OP even check incremeted : "+res);

        }
        return res;
        
    }
    
    public int paliCheck(String s, int l, int h){
        int ans=0;
        //traverse across and increment ans variable
        while(l>=0 && h <s.length()){
            if(s.charAt(l) == s.charAt(h)) {
            l--;
            h++;
            ans++;
            System.out.println("ans: "+ans);
            System.out.println("l: "+l+" hi "+h);    
           
            }
            //if characters are not same break
           else if(s.charAt(l) != s.charAt(h))
           {break;}
            
        }
        
      return ans;  
    }
}