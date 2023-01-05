class Solution {
    public int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
        //int count =0;
        Map<Integer, Integer> res = new HashMap<>();
        //HashMap<Integer, Integer> mp = new HashMap<>();

        for(int k:nums3){
            for(int l : nums4){
                res.put(k+l, res.getOrDefault(k + l,0)+1);

            }
        }
        int count=0;

        for(int i :nums1){
            for(int j : nums2){
                count+= res.getOrDefault(-(i+j),0);
                
            }
            
        }
        
        
        return count;
    }
}
