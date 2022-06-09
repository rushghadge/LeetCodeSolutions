

class Solution {
    public String intToRoman(int num) {
int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};    
String[] symbols = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
    StringBuilder sb = new StringBuilder();
      // while(num != 0  ){
      //     for(int i=0;i<=values.length ;i++){
      //         if(values[i]  <= num){
      //             num-=values[i];
      //             sb.append(symbols[i]);
      //             break;
      //         }
      //     }
      //      System.out.println(sb.toString());
      // }//while  
         for (int i = 0; i < values.length && num > 0; i++) {
            // Repeat while the current symbol still fits into num.
            while (values[i] <= num) {
                num -= values[i];
                sb.append(symbols[i]);
            }
        }
        
       return sb.toString(); 
    }
}