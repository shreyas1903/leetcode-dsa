class Solution {
    public int majorityElement(int[] nums) {
        int x =0;
        int maj = nums.length / 2;
        HashMap<Integer,Integer> res = new HashMap<>();
        for(int num : nums){
            if(!res.containsKey(num)){
                res.put(num, 1);
            }
            else{
                res.put(num, res.get(num)+1);
            }
            if(res.get(num) > maj){
                x = num;
                break;
            }

        }
        return x;
        
    }
}
