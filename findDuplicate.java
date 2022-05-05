class Solution {
    public int findDuplicate(int[] nums) {
        HashMap<Integer,Integer> res = new HashMap<>();
        int num =0;
        for(int i =0; i < nums.length; i++){
            if(res.containsKey(nums[i])){
                return nums[i];
            }
            else{
                res.put(nums[i],1);
            }
        }
        return -1;
    }
}
