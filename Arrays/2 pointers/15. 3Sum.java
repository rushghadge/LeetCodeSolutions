class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
       Arrays.sort(nums);
        for(int i : nums)
System.out.println("nums: sorted : "+i);
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        int t = 0;
        for(int i =0;i<nums.length-1; i++){
            int cur= nums[i];
            int l = i+1; int r = nums.length-1;
            
            System.out.println("i: "+nums[i] +" l :"+nums[l]+ " r: "+nums[r]);
            int sum = cur + nums[l]+ nums[r];
 System.out.println("sum: "+sum);

            if(sum == t){
                
                res.add(Arrays.asList(nums[i],nums[l],nums[r]));
                 System.out.println("Added : "+res);

            }else if(sum > t){
                r --;
          System.out.println("r -- : "+nums[r]);

                                
            }else{
                l++;
 System.out.println("l++ : "+nums[l]);

            }
            
        }
        return res;
    }
}