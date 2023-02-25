class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int n = nums.length;
        int diff = Integer.MAX_VALUE;
        Arrays.sort(nums);
        int result =0;

        for(int i =0;i<n;i++){
            int j = i+1;
            int k = n -1;
            while(j<k){
                int sum = nums[i]+nums[j]+nums[k];
                if(Math.abs(diff)> Math.abs(sum - target)){
                    diff = sum - target;
                    result = sum;
                }
                if(sum<target){
                    j++;
                }
                else{
                    k--;
                }

            }
            
        }
        return result;
        
    }
}
