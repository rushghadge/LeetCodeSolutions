class Solution {
    //SLIDING WINDOW, Hashmap for counter 
    public int totalFruit(int[] fruits) {
        // declare hm to store latest inex of variables
        Map<Integer, Integer>  hm = new HashMap<Integer, Integer>();
        // declare pointrs
        int i =0; int j = 0;
        int max=0;
        
        while(j < fruits.length){
          
           // add the elements until we get 2 uniqueue fruits!
            if(hm.size()<=2){
                 hm.put(fruits[j],j); 
                System.out.println("HM: "+hm);
            }
            j++;
            // if we come cross 3rd fruite
            if(hm.size()> 2)
            {
                // find the left most element which will have min index, we are removing left most element
               //initislize min to max value
                int min = fruits.length-1;
                //traverse values and find the min
                for(int val: hm.values()){
                    min = Math.min(min,val );
                }
                
                // remove element 
                hm.remove(fruits[min]);
                // increment the i 
                i = min+1;
                
            }
            // find max value 
            max= Math.max(max, j-i);
            
        }//while
        return max;
    }
}