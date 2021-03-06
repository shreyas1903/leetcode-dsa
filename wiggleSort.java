class Solution {
    public void wiggleSort(int[] nums) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int i =0; i < nums.length; i++){
            pq.add(nums[i]);
        }
        
        int size = pq.size();
        for(int i=1; i < size; i+=2){
           nums[i] = pq.poll();
        }
        for(int i =0; i < size; i+=2){
            nums[i] = pq.poll();
        }
    }
}
