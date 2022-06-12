class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        int cursum=0,sum=0, max=0;
        Map<Integer, Integer> mp = new HashMap<>();
        for(int i=0; i < nums.length; i++){
            cursum += nums[i];
            if(mp.containsKey(nums[i])){
                sum = Math.max(sum, mp.get(nums[i]));
            }
            max = Math.max(max, cursum - sum);
            mp.put(nums[i], cursum);
        }
        return max;
            
    }
}
