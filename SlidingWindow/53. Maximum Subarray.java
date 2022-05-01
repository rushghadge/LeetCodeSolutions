}
 //Sliding window approach 
class Solution {
    public int maxSubArray(int[] nums) {
        int len = nums.length;
       
        int maxS = nums[0];
        int curS= 0;
        // iterate through each element 
        for(int i = 0; i< len;i++){
            // check sum, if less than 0, reset to 0
            if(curS< 0){
                curS = 0;
            }
            // cal sum and go to next element in next iteration add up again, 
            curS = curS + nums[i];
            //Update value  of max sum 
            maxS = Math.max(curS,maxS);
        }
        
        return maxS;
        
    }
}