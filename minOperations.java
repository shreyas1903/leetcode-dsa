class Solution {
    public int minOperations(int[] nums, int x) {
        int target = -x;
        
        for(int i :nums){
            target += i;
        }
        if(target == 0){
            return nums.length;
        }
        int sum =0;
        int res = -1;
        Map<Integer, Integer> mp = new HashMap<>();
        mp.put(0, -1);
        for(int i =0; i < nums.length; i++){
            sum +=nums[i];
            if(mp.containsKey(sum - target)){
                res = Math.max(res, i - mp.get(sum- target));
            }
            mp.put(sum,i);
            
        }
        return res == -1 ? -1: nums.length - res; 
        
    }
}
