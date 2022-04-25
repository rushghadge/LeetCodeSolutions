
class Solution {
    //INPLACE Modification
    public List<Integer> findDisappearedNumbers(int[] nums) {
  
    List<Integer> l = new ArrayList<>();
     for(int i=0;i<nums.length;i++){
     // if we have num as 1, it will be mapped to 0, If we have 4, it will be mapped to 3
     /* Mapping is shown below:
     1,4,4,4   nums
     0,1,2,3  arr[i]
     
     */
     System.out.println("nums[i]:"+ nums[i] );
        int newIndex = Math.abs(nums[i])-1;
      /* update the nums inplace if value exist mark it as negative in next line
            -1,4,4,-4   nums
             0,1,2,3  arr[i]
     
     */
        nums[newIndex] = -1* Math.abs(nums[newIndex]);
     System.out.println("nums[newIndex]:"+ nums[newIndex] +"i :"+newIndex);
     }
      for(int j = 0;j< nums.length; j++){
        System.out.print(" "+nums[j]);
     }
     for(int j = 0;j< nums.length; j++){
        if(nums[j]>0){
            l.add(j+1);
        }
     }
     
        
       return l; 
    }
}