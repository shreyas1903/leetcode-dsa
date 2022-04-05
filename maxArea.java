class Solution {
    public int maxArea(int[] height) {
        int max=0;
        for(int i=0; i< height.length; i++){
            for(int j=1; j <height.length;j++){
                int min = Math.min(height[i], height[j]);
                int res = min * (j - i);
                if(max < res){
                    max = res;
                }
            }
        }
        return max;
    }
}
