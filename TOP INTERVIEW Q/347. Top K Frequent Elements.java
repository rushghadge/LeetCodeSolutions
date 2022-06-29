class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        //bucket array > index means frequenc of occurance 
 List<Integer>[] bucket = new List[nums.length + 1];
	
        //hm for mapping no-> freq 
        Map<Integer, Integer> frequencyMap = new HashMap<Integer, Integer>();

	for (int n : nums) {
		frequencyMap.put(n, frequencyMap.getOrDefault(n, 0) + 1);
	}
//populte bucket based on frequency as per index, and store values 
        //eg 1-> 3, 2-> 3
   //     0 1 2 3        index of bucket
    //          [1,2]    value in bucket
	for (int key : frequencyMap.keySet()) {
		int frequency = frequencyMap.get(key);
		if (bucket[frequency] == null) {
			bucket[frequency] = new ArrayList<>();
		}
		bucket[frequency].add(key);
	}

	List<Integer> res = new ArrayList<>();

	for (int pos = bucket.length - 1; pos >= 0 && res.size() < k; pos--) {
		if (bucket[pos] != null) {
			res.addAll(bucket[pos]);
		}
	}
	 int[] ret = new int[res.size()];
    for (int i=0; i < ret.length; i++)
    {
        ret[i] = res.get(i).intValue();
    }
        return ret;
    }
}