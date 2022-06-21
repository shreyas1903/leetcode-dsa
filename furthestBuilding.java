class Solution {
    public int furthestBuilding(int[] heights, int bricks, int ladders) {
        Queue<Integer> res = new PriorityQueue<>();
        for(int i =1; i < heights.length; i++){
            if(heights[i-1] < heights[i]){
                res.add(heights[i] - heights[i-1]);
            }
            if(ladders < res.size()){
                bricks -= res.poll();
            }
            if(bricks <0){
                return i -1;
            }
        }
        return heights.length -1;
    }
}
