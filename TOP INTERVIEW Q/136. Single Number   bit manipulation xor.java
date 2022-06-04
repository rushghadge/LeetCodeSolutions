class Solution {
  public int singleNumber(int[] nums) {
    
      //bitmanipulation 
      /*
      a xor a = o;
      0 xor a = a;  // 1 xor 0 = 1, 0 xor 1 = 1 
      
      
      */
      
      int res = 0;
      
      for(int i: nums){
          
          res ^=i;
      }
      return res;
      
  }
}