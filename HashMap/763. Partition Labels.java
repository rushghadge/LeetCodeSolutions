class Solution {
    public List<Integer> partitionLabels(String s) {
        // hm store the last index of char.
        HashMap<Character, Integer> hm = new HashMap<>();
        for(int i = 0; i <s.length(); i++){
            char c = s.charAt(i);
            hm.put(c,i);
            
        }
        System.out.println("hm:"+hm);
        List<Integer> res = new ArrayList<>();
        //size - store size of partition 
        int size = 0; int p = -1;
    for(int i = 0; i <s.length(); i++){
        char c = s.charAt(i);
        //get last index 
        int idx =hm.get(c);
       
        //update size
        size = Math.max(size, idx);
        if(i == size) // time for partition
        {
            res.add(size - p);
            p=size ; // if a ends at index 4, we store last index, so it is used to calculate size for next index
            
        }
        }  //for               
                           
        
        
        return res;
        
    }
}