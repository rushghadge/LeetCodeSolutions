class Solution {
    public int missingNumber(int[] nums) {
         int actSum=0;
       //formula 
        int n = nums.length;
        int expectedSum = (n*(n + 1) )/2;
        System.out.println("es "+expectedSum );
        for(int num: nums) 
             actSum += num;
        
        return expectedSum - actSum;
    }
}