class Solution {
    
    public void result(int ind, int target, int[] arr, List<List<Integer>> res, List<Integer> ds ){
        
        if(target == 0){
            res.add(new ArrayList<>(ds));
            return;
                
        }
        
        
        
        for(int i =ind; i < arr.length;i++){
            if(i>ind && arr[i] == arr[i-1]) continue;
            if(arr[i] > target) break;
            
            ds.add(arr[i]);
            result(i+1, target - arr[i], arr, res ,ds);
            ds.remove(ds.size() -1);
        }
        
    }
    
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> res= new ArrayList<>();
        Arrays.sort(candidates);
        result(0, target, candidates, res, new ArrayList<>());
        return res;
    }
}
