// bottom up dp 
class Solution {
    public int coinChange(int[] coins, int amount) {
        int[] dp = new int[amount+1];
        int max= amount+1;
        Arrays.fill(dp,max);
        dp[0]= 0;
        for(int a=1;a<=amount;a++){ // iterate all amount in dp 
          for(int c: coins){ // iterate all coint 
              if(a-c >=0){ 
                  dp[a]=Math.min(dp[a],1+dp[a-c]);
              }
              
          }  
            
            
        }//for
        
        return dp[amount] != max? dp[amount] : -1;
        
    }
}