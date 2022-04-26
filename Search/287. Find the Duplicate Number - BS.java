class Solution {
    
    public int findDuplicate(int[] nums) {
        // 'low' and 'high' represent the range of values of the target        
        int low = 1, high = nums.length - 1;
        int duplicate = -1;
        
        while (low <= high) {
            System.out.println("l: "+low+" " +"high: "+high);

            int cur = (low + high) / 2;
System.out.println("curr : "+cur);
            // Count how many numbers in 'nums' are less than or equal to 'cur'
            int count = 0;
            for (int num : nums) {
                if (num <= cur)
                    count++;
            }
            System.out.println("cnt : "+count);
            //if curr satisfies consition, we check for lower elements towards left, else move to right
            if (count > cur) {
                duplicate = cur;
                System.out.println("duplicate : "+duplicate);

                high = cur - 1;
                 System.out.println("new high : "+high);

                
            } else {
                low = cur + 1;
 System.out.println("new low else :  "+low);

            }
        }
        return duplicate;
    }
}