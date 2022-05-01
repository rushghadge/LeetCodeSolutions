


class Solution {
    public void sortColors(int[] nums) {
    int len = nums.length;
        // have 2 pointers 
        // start ptr -- check for 0, end  checks for 2 
        int start = 0; int end = len-1;
        int i = 0; // current val
        while(start< end && i <= end){
        // start tracks and points to place where it will place 0
        if(nums[i] == 0){
        // whatever we have in n[start] put it in n[i], ans place 0 where start index points, post that increment start
            nums[i] = nums[start];
            nums[start] = 0;
            
            start++;
            i ++;
        
        }// if we get 2, swap with value at end pinter and num [i], 
            //place 2 where end pointer points,
            // why not to increment index? : it can have 0, we need to process it again 
        else if(nums[i]== 2){
            
        nums[i]= nums[end];
        nums[end] = 2;
        end--;
        
        }
        else{ // if one then leave it and increment current index i
        i++;
        }
        
        }
    }
}