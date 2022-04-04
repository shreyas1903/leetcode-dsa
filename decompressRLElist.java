class Solution {
    public int[] decompressRLElist(int[] nums) {
        List<Integer> res = new ArrayList<>();
        for(int i =0; i < nums.length; i=i+2){
            int freq = nums[i];
            int val = nums[i+1];
            for(int j=0; j < freq; j++)
                res.add(val);
        }
        int[] result = new int[res.size()];
        for(int i =0; i <res.size(); i++){
            result[i] = res.get(i);
        }
        return result;
    }
}
