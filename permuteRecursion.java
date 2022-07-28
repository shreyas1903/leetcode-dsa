class Solution {
    
    public void result(int start, int[] nums, List<List<Integer>> res){
        if(start == nums.length){
            List<Integer> ds = new ArrayList<>();
            
            for(int i =0;i<nums.length;i++){
                ds.add(nums[i]);
            }
            res.add(new ArrayList<>(ds));
        }
        
        for(int i =start;i<nums.length; i++){
            swap(i,start ,nums);
            result(start+1,nums,res);
            swap(i,start,nums);
        }
    }
    
    private void swap(int i, int j , int[] nums){
        int t;
        t=nums[i];
        nums[i]=nums[j];
        nums[j] = t;
        return;
    }
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        
        result(0,nums,res);
        return res;
    }
}
