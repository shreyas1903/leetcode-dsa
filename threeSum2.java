class Solution {
    public List < List < Integer >> threeSum(int[] nums) {
        Arrays.sort(nums);
        Set < List < Integer >> result = new HashSet();;
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            Map<Integer, Integer> zero = new HashMap<>();
            for (int j = i + 1; j < n; j++) {
                if(zero.containsKey(0 - nums[i] - nums[j])){
                    int k = zero.get(0 - nums[i] - nums[j]);
                    
                    if(k == i | k == j){
                        continue;
                    }
                    else {
                    List <Integer> triplet = new ArrayList <Integer> ();
                    triplet.add(nums[i]);
                    triplet.add(nums[j]);
                    triplet.add(nums[k]);
                    result.add(triplet);

                }
                }
                zero.put(nums[j],j);
                
            }
            
        }
       List<List<Integer>> threeSum = new ArrayList();
        threeSum.addAll(result);
        return threeSum;
    }
}
