class Solution {
    public int minDeletion(int[] nums) {
        int delete=0;
        for(int i =0; i < nums.length -1;i++){
            int ind = i-delete;
            if(ind%2 == 0 && nums[i] == nums[i+1]){
                delete++;
                
            }
           
        }
        
        return ((nums.length-delete)%2 == 0)? delete : delete+1;
        
    }
}
