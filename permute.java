class Solution {
    
    
    public void result(int[] nums, List<List<Integer>> res, List<Integer> ds, boolean[] freq){
        if(ds.size() == nums.length){
            res.add(new ArrayList<>(ds));
            return;
        }
        for(int i =0; i<nums.length;i++){
            if(freq[i] == false){
                freq[i] = true;
                ds.add(nums[i]);
                result(nums,res,ds,freq);
                ds.remove(ds.size()-1);
                freq[i] = false;
            }
        }
    }
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> ds = new ArrayList<>();
        boolean freq[] = new boolean[nums.length];
        result(nums, res,ds,freq);
        return res;
    }
}
