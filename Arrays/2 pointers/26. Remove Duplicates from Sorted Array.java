
class Solution {
    public int removeDuplicates(int[] nums) {
        int len = nums.length;
        int idx=1; // because since array is sorted already, value of el @ idx 0 wont change
        
        // start from 1st
        for(int i = 1; i< len;i++){
           //compare curr and cur-1 element at nums
           if(nums[i]!= nums[i-1]){
               //update val pointed by i index in nums
               nums[idx]=nums[i];
               
               // update index to next
               idx++;
               
           }
            // in the end index will point to next element expecting for new unseen el, if not found, 
            // all values prev to idx are sorted, thus return idx as value
       }
        return idx;
}
}