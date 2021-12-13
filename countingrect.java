class Solution {
    public int countGoodRectangles(int[][] rectangles) {
        int count =0;
        int max = 0;
        for(int i=0; i<rectangles.length; i++){
            int min = rectangles[i][0];
            
            if(rectangles[i][1] < min){
                min = rectangles[i][1];
            }
            if(min>max){
                max = min;
                count=1;
                
            }
            else if(min == max)
            {
                count++;
            }                
        }
        return count;
    }
}
