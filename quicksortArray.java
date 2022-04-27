class Solution {
    public int[] sortArray(int[] nums) {
        quicksort(nums, 0, nums.length -1);
        return nums;
    }
    public int partition(int[] nums, int low, int high){
        int pivind = nums[high];
        int i =low -1;
        for(int j=0; j < nums.length; j++){
            i++;
            //swap
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            
        }
        return i;
    }
    public  void quicksort(int[] nums, int low, int high){
        if(low < high){
            int pivind = partition(nums,low,high);
            
            quicksort(nums, low, pivind - 1);
            quicksort(nums, pivind+1, high);
        }
        
        
    }
    
}
