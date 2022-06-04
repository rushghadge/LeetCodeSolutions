class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer, Integer> hm = new HashMap<Integer, Integer>();
     // store in map, value and its index, if found in hm, then check diff of index <=k
        for(int i = 0; i < nums.length ;i++){
            if(hm.containsKey(nums[i]) &&   i-hm.get(nums[i]) <= k ){
                return true;
            }
            else{
                hm.put(nums[i], i);
   
                
            }
            
        }
        return false;
        
    }
}