

//Idea is to use linkedlist and then use hair tortoise to find intersection , 
// and then confirm distance fromintercestion, and from start for LL
class Solution {
    public int findDuplicate(int[] nums) {
    
        // Find the intersection point of the two runners.
        //initialise slow and fast pointer to first val in array 
        int s = nums[0];
        int f = nums[0];
        
        //increament f , s until they intersect, assume LL 
        // we are fetching num[0], based on value. visiting and fetching nums[value]  ,
        //since we wanna check intersection at value 
        
        do {
            s = nums[s];
            f = nums[nums[f]];
        } while (s != f);
       
        // now s& f intersects and above do while is completed...
        // Find the "entrance" to the cycle.
        //declare 2nd slow ptr, initialize at start..
        int  s1 = nums[0];
        
        // until new s and s or h is same return s
        while (s != s1) {
            s = nums[s];
            s1 = nums[s1];
        }
        return s;
                
    }
}