

class Solution {
   

    public int romanToInt(String s) {
         Map<Character, Integer> values = new HashMap<>();
         values.put('M', 1000);
        values.put('D', 500);
        values.put('C', 100);
        values.put('L', 50);
        values.put('X', 10);
        values.put('V', 5);
        values.put('I', 1);
        
        int l= s.length();
        System.out.println("Len: "+l);
        int tot = 0;
        int i =0;
        while(i<l){
        System.out.println("I "+i);
 int cVal = values.get(s.charAt(i)); int nVal=0 ;
         System.out.println(values.get(s.charAt(i)));
            if(i+1 < l){
                 nVal =  values.get(s.charAt(i+1));
               
            }
            if(cVal < nVal )   
                {
                  tot+= (nVal - cVal);
                  i+=2;
                
                }else{
       
              tot+= cVal ;
                System.out.println("t "+tot+"i "+i);
             i+=1;
         
            }
                       }//while
        
        return tot;
}
}