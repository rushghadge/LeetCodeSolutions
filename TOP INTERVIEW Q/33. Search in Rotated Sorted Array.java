class Solution {
    public int search(int[] nums, int target) {
        
        //  5  0 1 2 3 4 
 //     45 6 0123
        int l = 0; int r= nums.length-1;
        while(l<=r){
            int mid = l+r-l/2;
           if( nums[mid] == target )
               return mid;
            
            // left soted 
            if(nums[mid]>= nums[l]){
                if(target> nums[mid])
                    l=mid+1;
                else if(target < nums[l])
                    l=mid+1;
                else 
                    r=mid-1;
                
            }
            // right sorted 
            else{
              if(target > nums[r])  
                  r = mid-1;
                  else if(target < nums[mid])
                      r=mid-1;
                  else 
                      l=mid+1;
                      
              
            }
            
        }
    return -1;
    
    }
}