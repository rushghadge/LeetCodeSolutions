 
class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
   Set<Integer> s = new HashSet<Integer>();
    List<Integer> l = new ArrayList<>();
        //O(n) since we are traversing n elements
        for(int n:nums){
            s.add(n);
        }
        // O(n)
        for(int i = 1; i<=nums.length;i++){
            // If element doesnt exisit in set it is missing
            if(!s.contains(i)){
                l.add(i);
                
            }
            
        }
        //O(n+n) = O (n)
        
       return l; 
    }
}