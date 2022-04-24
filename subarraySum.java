class Solution {
    public int subarraySum(int[] nums, int k) {
        int start =0;
        int end = -1;
        int cursum =0;
        int count =0;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i =0; i < nums.length; i++){
            cursum += nums[i];
            if(cursum - k == 0){
                start =0;
                end =i;
                count++;
            }
            if(map.containsKey(cursum - k)){
                start = map.get(cursum - k)+1;
                end =i;
                count++;
            }
            map.put(cursum, i);
            
        }
        return count;
    }
}
