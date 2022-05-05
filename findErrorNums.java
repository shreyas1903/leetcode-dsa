class Solution {
    public int[] findErrorNums(int[] nums) {
        int[] x = new int[2];
        HashMap<Integer, Integer> res = new HashMap<>();
        for(int i: nums){
            if(res.containsKey(i)){
                x[0] = i;
            }
            else{
                res.put(i, 1);
            }
        }
        for(int i =1; i <= nums.length; i++){
            if(!res.containsKey(i)){
                x[1] = i;
                break;
            }
        }
        return x;
    }
}
