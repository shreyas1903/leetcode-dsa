class Solution {
    
    public void result(int start, int[] nums ,List<Integer> ds,  List<List<Integer>> res){
        res.add(new ArrayList<>(ds));
        for(int i =start;i< nums.length;i++){
            if(i>start && nums[i] == nums[i-1])continue;
            ds.add(nums[i]);
            result(i+1,nums,ds,res);
            ds.remove(ds.size()-1);
            
        }
        
    }
    
    
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        result(0,nums,new ArrayList<>(),res);
        return res;
        
    }
}
