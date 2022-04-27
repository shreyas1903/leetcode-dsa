class Solution {
    public int findKthLargest(int[] nums, int k) {
        
        quicksort(nums, 0, nums.length - 1);
        return nums[nums.length - k];
    }
    private void quicksort(int[] nums, int low, int high){
        if(low < high){
            int pi = partition(nums, low , high);
            quicksort(nums, low, pi - 1);
            quicksort(nums, pi+1, high);
        }
    }
    private int partition(int[] nums, int low, int high){
        int pivot = nums[high];
        int i =(low - 1);
        for(int j =low; j  <high; j++){
            if(nums[j] < pivot){
                i++;
                swap(nums, i , j);
            }
        }
        swap(nums, i+1, high);
        return i+1;
        
    }
    static void swap(int[] nums, int i , int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
