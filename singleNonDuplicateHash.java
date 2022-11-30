class Solution {
    public int singleNonDuplicate(int[] nums) {
        HashSet<Integer> res = new HashSet<>();
        for(int i=0;i<nums.length; i++){
            if(res.contains(nums[i])){
                res.remove(nums[i]);
            }
            else{
                res.add(nums[i]);
            }
        }
        int ans =0;
        for(int mv : res){
            ans = mv;
        }
        return ans;
    }
}
