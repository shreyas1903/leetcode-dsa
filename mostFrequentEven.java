class Solution {
    public int mostFrequentEven(int[] nums) {
        int n = nums.length;
        int max=-1;
        HashMap<Integer, Integer> res = new HashMap<>();
        for(int num : nums){
            if(num %2 == 0){
                res.put(num,res.getOrDefault(num,0)+1);
                max = Math.max(max,res.get(num));
            }
            
        }
        int count =Integer.MAX_VALUE;
        
        if(max == 0){
            return -1;
        }
        for(int i : res.keySet()){
            if(res.get(i) == max){
                count = Math.min(count,i);
            }
        }
        if(count == Integer.MAX_VALUE)return -1;
        return count;
    }
}
