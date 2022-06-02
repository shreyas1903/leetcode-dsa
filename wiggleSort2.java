class Solution {
    public void wiggleSort(int[] nums) {
        int[] res = new int[nums.length];
        Arrays.sort(nums);
        int i=1;
        int n = nums.length;
        int j=n-1;
        while(i<n){
            res[i] = nums[j];
            i+=2;
            j--;
        }
        i=0;
        while(i<n){
            res[i] = nums[j];
            i+=2;
            j--;
        }
        for(int k =0; k<nums.length; k++){
            nums[k] = res[k];
        }
    }
}

