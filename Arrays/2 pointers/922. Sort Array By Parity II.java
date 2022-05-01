// 4 2 5 7
// 0 1 2 3  -- ind 

// 4 5 2 7--op
// //approach 
// pointers: ep=0, op=1
// for(){
// if(n[i] % 2 == 0 ){
//     r[ep]=n[i]
//     rp+=2;
// }
//     else {
//         r[op]=n[i];
//         op+=2;
//     }
// }//for 

class Solution {
    public int[] sortArrayByParityII(int[] nums) {
//         int[] r = new int[nums.length];
//         //declare pointrs:
//         int ep=0;int op=1;
//         //approach 1:
//         for(int i=0;i<nums.length;i++){
//                 if(nums[i] % 2 == 0 ){
//                     r[ep]=nums[i];
//                     ep+=2;
//                 }
//                     else {
//                         r[op]=nums[i];
//                         op+=2;
//                     }
// }//for 
//       return r;  
        
        //inplace approach 2:
        //declare pointers:
        int ep=0;int op=1;
        
      
        
        while(ep < nums.length && op < nums.length){
          // if nums at even index are even increment even ptr
            if(nums[ep] % 2 == 0){
                ep+=2;
            }
     // if nums at odd index are odd increment odd ptr

            else if(nums[op] % 2 == 1){
                op+=2;
            }
            else{
                // else it means ep and op points to incorrect val, swap!!
                int t = nums[ep];
            nums[ep]=nums[op];
            nums[op]=t;
            }
            
        }

       return nums; 
    }
}