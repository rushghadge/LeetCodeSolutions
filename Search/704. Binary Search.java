class Solution {
    public int search(int[] nums, int target) {
         int pivot, left = 0, right = nums.length - 1;
    while (left <= right) {
     System.out.println("l :"+left+" R "+right);

      pivot = left + (right - left) / 2;
        System.out.println("pivot "+pivot);
      if (nums[pivot] == target) return pivot;
      if (target < nums[pivot]) right = pivot - 1;
      else left = pivot + 1;
    }
    return -1;
    }
}