class Solution {
    public int minimumDeletions(int[] nums) {
        if(nums.length<=2) return nums.length;
        int minpos=0;
        int maxpos=0;
        int min=Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int i=0; i<nums.length;i++){
            if(nums[i] <min){
                min = nums[i];
                minpos=i;
            }
            if(nums[i] >max){
                max = nums[i];
                maxpos=i;
            }
        }
        
        
        int a = Math.max(minpos, maxpos)+1;
        int b = nums.length - Math.min(minpos, maxpos);
        int c = Math.min(minpos,maxpos)+1+ (nums.length- Math.max(minpos,maxpos));
            
        return Math.min(Math.min(a,b), c);
    }
}
