class Solution {
    public int singleNonDuplicate(int[] nums) {
        Stack<Integer> res = new Stack<>();
        for(int i =0;i<nums.length;i++){
            if(res.isEmpty() || nums[i] != res.peek()){
                res.add(nums[i]);
            }
            else{
                res.pop();
            }
        }
        return res.pop();
    }
}
