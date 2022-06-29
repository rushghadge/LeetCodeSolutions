
class Solution {
    public int[] searchRange(int[] nums, int target) {
        
        
     int fno= bs(nums,target, true);
     int lno = bs(nums,target, false);
     
      return new int[]{fno, lno};
  
       
       
    }
   public int bs(int[] num, int target,boolean lft ){
       int l=0; int r = num.length -1;
        int idx=-1;
       while(l<=r){
      
       int m = l+(r-l)/2;
       
       if(num[m]< target){
       l = m+1;
       
       }
      
      
      else if (num[m] == target)
       {
       idx=m;
       if(lft){ //left
       
     //  if( num[m-1]!= target || m == l) return m;
       
       r=m-1;
       }
       else{
      //  if( num[m+1]!= target || m == r) return m;
       
       l=m+1;
       }
       
       
       } else{
       r= m-1;
       }
       
       
       }//while
      return idx; 
    }
}