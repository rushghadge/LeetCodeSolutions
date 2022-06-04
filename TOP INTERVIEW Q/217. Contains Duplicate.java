class Solution {
    public boolean containsDuplicate(int[] nums) {
        int l=0, r=nums.length-1;
//         while(l<r){
//             if(nums[l]==nums[r]){
//                 return true;
               
//             }
//             l++;r--;
            
//         }
        // return false;
        
        Set<Integer> set = new HashSet<Integer>();
        for(int i = 0; i <  nums.length;i++){
            if(set.contains(nums[i])) return true;
            set.add(nums[i]);
            
        }
        return false;
    }
}